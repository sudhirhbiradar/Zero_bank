package com.zerobank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.qa.base.testbase;

public class Add_new_payee_page extends testbase {

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

	@FindBy(xpath = "//a[@href='/bank/redirect.html?url=pay-bills.html']")
	private static WebElement paybills;

	@FindBy(xpath = "//a[@href='#ui-tabs-2']")
	private static WebElement addnewpayeelink;

	@FindBy(xpath = "//input[@id='np_new_payee_name']")
	private static WebElement payeename;

	@FindBy(xpath = "//textarea[@id='np_new_payee_address']")
	private static WebElement payeeaddress;

	@FindBy(xpath = "//input[@id='np_new_payee_account']")
	private static WebElement payeeaccount;

	@FindBy(xpath = "//input[@id='np_new_payee_details']")
	private static WebElement payeedetails;

	@FindBy(xpath = "//input[@id='add_new_payee']")
	private static WebElement addbutton;

	public Add_new_payee_page() {

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

	public void paybillslink() {
		paybills.click();
	}

	public void clickaddnewpayeelink() {
		addnewpayeelink.click();

	}

	public void clickname() {
		payeename.sendKeys("SUDHIR BIRADAR");

	}

	public void clickaddressname() {
		payeeaddress.sendKeys("kini yelladevi");

	}

	public void clickaccount() {
		payeeaccount.sendKeys("706688");

	}

	public void clickpayeedetailsfield() {
		payeedetails.sendKeys("he is working with xoriant solution pvt. ltd.");

	}

	public void clickaddbutton() {
		addbutton.click();

	}

}
