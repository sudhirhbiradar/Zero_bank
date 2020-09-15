package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;
import com.zerobank.qa.pages.Login_page;
import com.zerobank.qa.pages.Online_transaction_page;

public class Online_transaction_page_test extends testbase {

	Online_transaction_page OTP;
	Login_page LP;

	public Online_transaction_page_test() {

		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();

		OTP = new Online_transaction_page();
		LP = new Login_page();

	}

	@Test

	public void TC13() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		OTP.clickonlink();
		OTP.select_list_account();
		OTP.clickdate();
		OTP.clickpdf();
	}

	@AfterMethod
	public void teardown1() {
		//driver.quit();
	}

}
