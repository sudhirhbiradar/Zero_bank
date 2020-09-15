package com.zerobank.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zerobank.qa.base.testbase;

public class Find_transaction_page extends testbase {

//	@FindBy(xpath = "//i[@class='icon-signin']")
//	private static WebElement signinbutton;
//
//	@FindBy(xpath = "//input[@type='text']")
//	private static WebElement loginbutton;
//
//	@FindBy(xpath = "//input[@type='password']")
//	private static WebElement passwordbutton;
//
//	@FindBy(xpath = "//input[@type='submit']")
//	private static WebElement signinbutton1;

	@FindBy(xpath = "//a[@href='/bank/redirect.html?url=account-activity.html']")
	private static WebElement accountactivitylink;

	@FindBy(xpath = "//a[@href='#ui-tabs-2']")
	private static WebElement findtransactionlink;

	@FindBy(xpath = "//input[@id='aa_description']")
	private static WebElement descriptiontextfield;

	@FindBy(xpath = "//input[@id='aa_fromDate']")
	private static WebElement datetextfield;

	@FindBy(xpath = "//input[@id='aa_fromAmount']")
	private static WebElement amounttextfield;

	@FindBy(xpath = "//select[@id='aa_type']")
	private static WebElement typelistbox;

	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement findbutton;

	public Find_transaction_page() {

		PageFactory.initElements(driver, this);
	}

//	public void clicksigninbutton() {
//		signinbutton.click();
//	}
//
//	public void clickloginbutton() {
//		loginbutton.sendKeys("username");
//	}
//
//	public void clickpasswordbutton() {
//		passwordbutton.sendKeys("password");
//	}
//
//	public void clicksigninbutton2() {
//		signinbutton1.click();
//	}

	public void clickaccountactivitylink() {
		accountactivitylink.click();
	}

	public void clickfindtransactionlink() {

		findtransactionlink.click();

	}

	public void clickdescriptiontext() {

		descriptiontextfield.sendKeys("OFFICE SUPPLY");

	}

	public void clickdatetext() {

		datetextfield.sendKeys("2012-09-05");

	}

	public void clickamounttext() {

		amounttextfield.sendKeys("50");

	}

	public void select_list_Type() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='aa_type']")));
		s.selectByVisibleText("Withdrawal");

	}

	public void clickfindbutton() {

		findbutton.click();

	}

}
