package com.zerobank.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zerobank.qa.base.testbase;

import com.zerobank.qa.pages.Feedback_page;

public class Feedback_page_test extends testbase {

	Feedback_page FP;

	public Feedback_page_test() {

		super();

	}

	@BeforeMethod
	public void setup() {
		initialization();
		FP = new Feedback_page();

	}

	@Test

	public void TC26() {

		FP.clickfeedbacklink();
		FP.clickname();
		FP.clickemailfield();
		FP.clicksubjectfield();
		FP.clicktextareafield();
		FP.clicksendsmsbtn();

	}

	@AfterMethod
	public void teardown1() {
		// driver.quit();
	}

}
