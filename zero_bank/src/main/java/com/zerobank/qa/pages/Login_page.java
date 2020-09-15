package com.zerobank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.qa.base.testbase;

public class Login_page extends testbase {

	@FindBy(xpath = "//i[@class='icon-signin']")
	private static WebElement signinbutton;

	@FindBy(xpath = "//input[@type='text']")
	private static WebElement loginbutton;

	@FindBy(xpath = "//input[@type='password']")
	private static WebElement passwordbutton;

	@FindBy(xpath = "//input[@type='submit']")
	private static WebElement signinbutton1;

	public Login_page() {
		PageFactory.initElements(driver, this);
	}

	public void clicksigninbutton() {
		signinbutton.click();
	}

	public void clickloginbutton() {
		loginbutton.sendKeys("username");
	}

	public void clickpasswordbutton() {
		passwordbutton.sendKeys("password");
	}

	public void clicksigninbutton2() {
		signinbutton1.click();
	}

}
