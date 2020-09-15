package com.zerobank.qa.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zerobank.qa.base.testbase;

public class Online_transaction_page extends testbase {

	@FindBy(xpath = "//a[@href='/bank/redirect.html?url=online-statements.html']")
	private static WebElement onlinestatementlink;

	@FindBy(xpath = "//a[@href='#os_2012']")
	private static WebElement year;

	@FindBy(xpath = "//a[@href='/bank/online-statements-by-name.html?name=8534567-01-10-12.pdf']")
	private static WebElement pdflink;

	public Online_transaction_page() {

		PageFactory.initElements(driver, this);

	}

	public void clickonlink() {
		onlinestatementlink.click();
	}

	public void select_list_account() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='os_accountId']")));
		s.selectByVisibleText("Loan");
	}

	public void clickdate() {
		year.click();

	}

	public void clickpdf() {
		pdflink.click();

	}

}
