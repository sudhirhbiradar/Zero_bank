package com.qa.ExtentReportListener;





import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReportListenerNg implements IReporter {
  private ExtentReports extent;

  
  public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
      extent = new ExtentReports(outputDirectory + File.separator + "ExtentReportsTestNG.html", true);

      for (ISuite suite : suites) {
          Map<String, ISuiteResult> result = suite.getResults();

          for (ISuiteResult r : result.values()) {
              ITestContext context = r.getTestContext();

              buildTestNodes(context.getPassedTests(), LogStatus.PASS);
              buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
              buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
          }
      }

      extent.flush();
      extent.close();
  }

//Creating a method getScreenshot and passing two parameters 
//driver and screenshotName
public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
                //below line is just to append the date format with the screenshot name to avoid duplicate names		
                String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
                //Returns the captured file path
		return destination;
}

  private void buildTestNodes(IResultMap tests, LogStatus status) {
      ExtentTest test;

      if (tests.size() > 0) {
          for (ITestResult result : tests.getAllResults()) {
              test = extent.startTest(result.getMethod().getMethodName());

              test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));


              for (String group : result.getMethod().getGroups())
                  test.assignCategory(group);

              String message = "Test " + status.toString().toLowerCase() + "ed";

              if (result.getThrowable() != null)
                  message = result.getThrowable().getMessage();

              test.log(status, message);

              extent.endTest(test);
          }
      }
  }

  private Date getTime(long millis) {
      Calendar calendar = Calendar.getInstance();
      calendar.setTimeInMillis(millis);
      return calendar.getTime();        
  }
}
