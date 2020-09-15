package com.zerobank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.qa.base.testbase;

public class My_money_map_page extends testbase {

	@FindBy(xpath = "//a[@href='/bank/redirect.html?url=money-map.html']")
	private static WebElement mymoneymaplink;

	public My_money_map_page() {

		PageFactory.initElements(driver, this);

	}

	
	public String getpagetitle() {
		
		return driver.getTitle();
		
		
	}
	public void clickmymoneymaplink() {
		mymoneymaplink.click();
	}
}