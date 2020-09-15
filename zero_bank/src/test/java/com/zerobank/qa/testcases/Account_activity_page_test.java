
package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;
import com.zerobank.qa.pages.Account_activity_page;
import com.zerobank.qa.pages.Login_page;


public class Account_activity_page_test extends testbase {

	Account_activity_page AAP;
	Login_page LP;
	public Account_activity_page_test() {

		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		AAP = new Account_activity_page();
		LP= new Login_page();
		
		
	}

	@Test

	public void TC13() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		AAP.clickaccountactivitylink();
		AAP.clicklistboxbutton();
		AAP.select_list_Savings();
		
	}
	@Test(priority = 1)

	public void TC14() {
		
		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		AAP.clickaccountactivitylink();
		AAP.clicklistboxbutton();
		AAP.select_list_checking();
	}

	

	@Test(priority = 2)

	public void TC15() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		AAP.clickaccountactivitylink();
		AAP.clicklistboxbutton();
		AAP.select_list_Savings2();

	}

	@Test(priority = 3)

	public void TC16() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		AAP.clickaccountactivitylink();
		AAP.clicklistboxbutton();
		AAP.select_list_loan();

	}
	
	@Test(priority =4 )

	public void TC17() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		AAP.clickaccountactivitylink();
		AAP.clicklistboxbutton();
		AAP.select_list_creditcard();

	}
	
	@Test(priority =5 )

	public void TC17_DOUBLE() {

		LP.clicksigninbutton();
		LP.clickloginbutton();
		LP.clickpasswordbutton();
		LP.clicksigninbutton2();
		AAP.clickaccountactivitylink();
		AAP.clicklistboxbutton();
		AAP.select_list_brokerage();

	}
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown1() {
		 driver.quit();
	}

}
