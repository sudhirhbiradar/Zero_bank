package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;

import com.zerobank.qa.pages.Find_transaction_page;
import com.zerobank.qa.pages.Login_page;

public class Find_transaction_page_test extends testbase {

	Find_transaction_page FTP;
	Login_page LP;
	public Find_transaction_page_test() {

		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		FTP = new Find_transaction_page();
		LP= new Login_page();
	}

	@Test

	public void TC18_TC19() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		FTP.clickaccountactivitylink();
		FTP.clickfindtransactionlink();
		FTP.clickdescriptiontext();
		FTP.clickdatetext();
		FTP.clickamounttext();
		FTP.select_list_Type();
		FTP.clickfindbutton();

	}

	@AfterMethod
	public void teardown1() {
		 driver.quit();
		 
	}

}