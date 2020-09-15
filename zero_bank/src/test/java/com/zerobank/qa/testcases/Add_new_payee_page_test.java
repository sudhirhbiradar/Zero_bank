package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;
import com.zerobank.qa.pages.Add_new_payee_page;
import com.zerobank.qa.pages.Login_page;
import com.zerobank.qa.pages.Pay_bills_page;


public class Add_new_payee_page_test extends testbase{

	
	Add_new_payee_page TFP;
	Login_page LP;
	

	public Add_new_payee_page_test() {

		super();

	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		TFP = new Add_new_payee_page();
		
		LP= new Login_page();
	}
	
	
	@Test
	public void TC22() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		
		
		
		
		TFP.paybillslink();
		TFP.clickaddnewpayeelink();
		TFP.clickname();
		TFP.clickaddressname();
		TFP.clickaccount();
		TFP.clickpayeedetailsfield();
		TFP.clickaddbutton();

	
	
	}
	
	
	@AfterMethod
	public void teardown1() {
		 driver.quit();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
