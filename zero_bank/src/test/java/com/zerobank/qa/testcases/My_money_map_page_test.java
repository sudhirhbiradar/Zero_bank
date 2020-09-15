package com.zerobank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;

import com.zerobank.qa.pages.Login_page;
import com.zerobank.qa.pages.My_money_map_page;

public class My_money_map_page_test extends testbase {

	My_money_map_page MMM;
	Login_page LP;

	public My_money_map_page_test() {

		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		MMM = new My_money_map_page();
		LP = new Login_page();
	}

	@Test

	public void verifyhomepagetitle() {

		String title = MMM.getpagetitle();
		System.out.println("this page title is:" + title);
		Assert.assertEquals(title, "Zero - Personal Banking - Loans - Credit Cards");

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		MMM.clickmymoneymaplink();

	}

	@AfterMethod
	public void teardown1() {
		driver.quit();
	}

}
