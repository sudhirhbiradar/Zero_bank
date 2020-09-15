package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;
import com.zerobank.qa.pages.Login_page;
import com.zerobank.qa.pages.Tranfer_fund_page;

public class Tranfer_fund_page_test extends testbase {

	Tranfer_fund_page TFP;
	Login_page LP;
	public Tranfer_fund_page_test() {

		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		TFP = new Tranfer_fund_page();
		LP= new Login_page();
	}

	@Test
	public void TC20() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		TFP.clickontranferfundlink();
		TFP.select_list_fromaccount();
		TFP.select_list_toaccount();
		TFP.clickonaccount();
		TFP.clickondiscription();
		TFP.clickoncontinuebutton();
		TFP.clickonfinalsubmitbutton();

	}

	@AfterMethod
	public void teardown1() {
		 driver.quit();
	}

}
