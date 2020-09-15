package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;
import com.zerobank.qa.pages.Home_page;
import com.zerobank.qa.pages.Login_page;

public class Home_page_test extends testbase {

	Home_page hp;
	Login_page LP;
	public Home_page_test() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		hp = new Home_page();
		LP= new Login_page();
	}

	@Test
	public void TC2() {
		LP.clicksigninbutton();

	}

	@Test(priority = 1)

	public void TC3() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();

	}

	@Test(priority = 2)

	public void TC4() {
		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();


	}

	@Test(priority = 3)

	public void TC5() {
		LP.clicksigninbutton();
		hp.clickforgotlink();
		hp.writeemailtext();
		hp.clicksendpassbutton();

	}

	@AfterMethod
	public void teardown1() {
		driver.quit();
	}

}