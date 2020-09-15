package com.zerobank.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zerobank.qa.base.testbase;

public class Pay_bills_page extends testbase {

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

	@FindBy(xpath = "//select[@name='payee']")
	private static WebElement paybillslistbox;

	@FindBy(xpath = "//select[@id='sp_account']")
	private static WebElement accountbillslistbox;

	@FindBy(xpath = "//input[@id='sp_amount']")
	private static WebElement amounttextfield;

	@FindBy(xpath = "//input[@id='sp_date']")
	private static WebElement datetextfield;

	@FindBy(xpath = "//input[@id='sp_description']")
	private static WebElement descriptiontextfield;

	@FindBy(xpath = "//input[@id='pay_saved_payees']")
	private static WebElement paybutton;

	public Pay_bills_page() {

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
//
//	public void paybillslink() {
//		paybills.click();
//	}
	public void clickonpaybillslink() {
		paybills.click();
	}
	public void listbox1() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='sp_payee']")));
		s.selectByIndex(1);

	}

	public void listbox2() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='sp_account']")));
		s.selectByIndex(2);
	}

	public void clickaccounttextfield() {
		amounttextfield.sendKeys("1000");
	}

	public void clickdatefield() {
		datetextfield.sendKeys("2020-08-17");
	}

	public void clickdescriptionfield() {
		descriptiontextfield.sendKeys("payment1");
	}

	public void clickpaybutton() {
		paybutton.click();
	}

}
