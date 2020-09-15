package com.zerobank.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zerobank.qa.base.testbase;

public class Purchase_currency extends testbase {
	
	
	

	@FindBy(xpath = "//a[@href='/bank/redirect.html?url=pay-bills.html']")
	private static WebElement paybills;

	@FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
	private static WebElement currencylink;
	

	@FindBy(xpath = "//select[@id='pc_currency']")
	private static WebElement currencydropdwn;
	
	
	@FindBy(xpath = "//input[@id='pc_amount']")
	private static WebElement currencyamount;
	
	@FindBy(xpath = "//input[@id='pc_inDollars_false']")
	private static WebElement radiobutton;
	
	@FindBy(xpath = "//input[@id='pc_calculate_costs']")
	private static WebElement calulatecostbutton;
	
	
	@FindBy(xpath = "//input[@value='Purchase']")
	private static WebElement purchasetbutton;
	
	
	public Purchase_currency() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void paybillslink() {
		paybills.click();
	}

	public void currencylink() {
		currencylink.click();

	}

	public void currencydropdwn() {
		Select s = new Select(driver.findElement(By.xpath("//select[@id='pc_currency']")));
		s.selectByIndex(3);

	}
	public void currencyamount() {
		currencyamount.sendKeys("100");

	}

	public void clickradiobutton() {
		radiobutton.click();

	}

	public void clickcalulatecostbutton() {
		calulatecostbutton.click();
	}

	public void clickpurchasetbutton() {
		purchasetbutton.click();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
