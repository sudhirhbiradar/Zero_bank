package com.zerobank.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zerobank.qa.base.testbase;

public class Tranfer_fund_page extends testbase {

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

	@FindBy(xpath = "//a[@href='/bank/redirect.html?url=transfer-funds.html']")
	private static WebElement transferfundlink;

	@FindBy(xpath = "//select[@id='tf_fromAccountId']")
	private static WebElement fromaccountdropdown;

	@FindBy(xpath = "//select[@id=id='tf_toAccountId']")
	private static WebElement toaccountdropdown;

	@FindBy(xpath = "//input[@name='amount']")
	private static WebElement amounttext;

	@FindBy(xpath = "//input[@name='description']")
	private static WebElement descriptiontext;

	@FindBy(xpath = "//button[@type='submit']")
	private static WebElement submitbutton;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private static WebElement finalsubmitbutton;

	public Tranfer_fund_page() {

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

	public void clickontranferfundlink() {
		transferfundlink.click();
	}

	public void select_list_fromaccount() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='tf_fromAccountId']")));
		s.selectByIndex(1);
		
	}

	public void select_list_toaccount() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='tf_toAccountId']")));
		s.selectByIndex(2);
	}

	public void clickonaccount() {
		amounttext.sendKeys("1000");
	}

	public void clickondiscription() {
		descriptiontext.sendKeys("checking fund transfer");
	}

	public void clickoncontinuebutton() {
		submitbutton.click();
	}

	public void clickonfinalsubmitbutton() {
		submitbutton.click();
	}

}
