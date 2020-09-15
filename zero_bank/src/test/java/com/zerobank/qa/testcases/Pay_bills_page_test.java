
package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;
import com.zerobank.qa.pages.Login_page;
import com.zerobank.qa.pages.Pay_bills_page;



public class Pay_bills_page_test extends testbase {
	
	Pay_bills_page TFP;
	Login_page LP;
	public Pay_bills_page_test() {

		super();

	}
	@BeforeMethod
	public void setup() {
		initialization();
		TFP = new Pay_bills_page();
		LP= new Login_page();
	}

	
	@Test
	public void TC21() {
		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		TFP.clickonpaybillslink();
		TFP.listbox1();
		TFP.listbox2();
		TFP.clickaccounttextfield();
		TFP.clickdatefield();
		TFP.clickdescriptionfield();
		TFP.clickpaybutton();

	
	
	}
	
	
	
		@AfterMethod
		public void teardown1() {
			 driver.quit();
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
