package com.zerobank.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.zerobank.qa.util.Testutils;



public class testbase {
	
	
	public static  WebDriver driver;
	 public static Properties prop;
	 
	public testbase(){
		
		try {
			
			prop=new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\SUD\\eclipse-workspace\\zero_bank\\src\\main\\java\\confi");
			prop.load(ip);	
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SUD\\Desktop\\drivers and poi\\chromedriver85\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SUD\\Desktop\\drivers and poi\\geckodriver.exe");
			 driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WT, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
		
		
		
	}
	

}



