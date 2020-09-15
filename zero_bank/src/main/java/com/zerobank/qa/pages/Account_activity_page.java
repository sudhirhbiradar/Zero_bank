package com.zerobank.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zerobank.qa.base.testbase;

public class Account_activity_page extends testbase {

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

	@FindBy(xpath = "//select[@id='aa_accountId']")
	private static WebElement listboxbutton;

	
	@FindBy(xpath="//select[@id='aa_accountId']")
	private static WebElement Select;
	
	
	public Account_activity_page() {

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

	public void clicklistboxbutton() {
		listboxbutton.click();
	}
	public void select_list_Savings() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='aa_accountId']")));
		s.selectByVisibleText("Savings");
	}

	public void select_list_checking() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='aa_accountId']")));
		s.selectByVisibleText("Checking");
	}
	
	public void select_list_Savings2() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='aa_accountId']")));
		s.selectByIndex(2);;
	}

	public void select_list_loan() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='aa_accountId']")));
		s.selectByVisibleText("Loan");
	}

	
	public void select_list_creditcard() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='aa_accountId']")));
		s.selectByVisibleText("Credit Card");
	}

	public void select_list_brokerage() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='aa_accountId']")));
		s.selectByVisibleText("Brokerage");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
