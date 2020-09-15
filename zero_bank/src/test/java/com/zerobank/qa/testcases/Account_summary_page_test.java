package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;
import com.zerobank.qa.pages.Account_summary_page;
import com.zerobank.qa.pages.Login_page;

public class Account_summary_page_test extends testbase {

	Account_summary_page ASP;
	Login_page LP;

	public Account_summary_page_test() {

		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		ASP = new Account_summary_page();
		LP= new Login_page();
		
		
	}

	@Test(priority = 1)

	public void TC6() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		
		ASP.clicksavinglink();
	}

	@Test(priority = 2)

	public void TC7() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		
		ASP.clicksavinglink2();
	}

	@Test(priority = 3)

	public void TC8() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		
		ASP.clickbrokeragelink();
	}

	@Test(priority = 4)

	public void TC9() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		
		ASP.clickcheckinglink();
	}

	@Test(priority = 5)

	public void TC10() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		
		ASP.clickcreditcardlink();
	}

	@Test(priority = 6)

	public void TC11() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		
		ASP.clickloanlink();
		;
	}

	@AfterMethod
	public void teardown1() {
		driver.quit();
	}

}
