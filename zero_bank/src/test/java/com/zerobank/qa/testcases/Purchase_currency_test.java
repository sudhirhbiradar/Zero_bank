package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;

import com.zerobank.qa.pages.Login_page;
import com.zerobank.qa.pages.Purchase_currency;

public class Purchase_currency_test extends testbase {

	Purchase_currency PC;
	Login_page LP;

	public Purchase_currency_test() {

		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		PC = new Purchase_currency();

		LP = new Login_page();
	}

	@Test
	public void TC23() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
        PC.paybillslink();
		PC.currencylink();
		PC.currencydropdwn();
		PC.currencyamount();
		PC.clickradiobutton();
		PC.clickcalulatecostbutton();
		PC.clickpurchasetbutton();

	}

	@AfterMethod
	public void teardown1() {
		// driver.quit();
	}

}
