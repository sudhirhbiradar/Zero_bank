package com.zerobank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.qa.base.testbase;

public class Account_summary_page extends testbase {
	
	
//	 @FindBy(xpath ="//i[@class='icon-signin']")
//	 private static WebElement signinbutton;
//	
//	 @FindBy(xpath= "//input[@type='text']")
//	 private static WebElement loginbutton;
//	
//	@FindBy(xpath= "//input[@type='password']")
//	 private static WebElement passwordbutton;
//	
//	@FindBy(xpath= "//input[@type='submit']")
//	 private static WebElement signinbutton1;
//	
	
	@FindBy(xpath= "//a[@href='/bank/account-activity.html?accountId=1']")
	 private static WebElement savingslink;
	
	
	@FindBy(xpath= "//a[@href='/bank/account-activity.html?accountId=3']")
	 private static WebElement savingslink2;
	
	@FindBy(xpath= "//a[@href='/bank/account-activity.html?accountId=6']")
	 private static WebElement brokeragelink;
	
	@FindBy(xpath= "//a[@href='/bank/account-activity.html?accountId=2']")
	 private static WebElement chechinglink;
	
	@FindBy(xpath= "//a[@href='/bank/account-activity.html?accountId=5']")
	 private static WebElement creditcardlink;
	
	
	@FindBy(xpath= "//a[@href='/bank/account-activity.html?accountId=4']")
	 private static WebElement loanlink;
	
	
	
	
	
	
	public Account_summary_page() {
	
	
		PageFactory.initElements(driver, this);
	}

	
	
	
	
//	public  void clicksigninbutton() 
//    {
//		signinbutton.click();
//    }
//    public   void clickloginbutton()
//    {
//		 loginbutton.sendKeys("username");
//	  }
//		
//	 public   void clickpasswordbutton() 
//	 {
//		 passwordbutton.sendKeys("password");
//	}
//		
//	 public   void clicksigninbutton2() 
//	 {
//		  signinbutton1.click();
//	 }
	
	
	 public   void clicksavinglink() {
		 savingslink.click();		
	}
		public   void clicksavinglink2() {
			savingslink2.click();
			
	}
		public   void clickbrokeragelink() {
			 brokeragelink.click();
			
	}
	
		public   void clickcheckinglink() {
			chechinglink.click();
			
	}
		public   void clickcreditcardlink() {
			creditcardlink.click();
			
	}
	
		public   void clickloanlink() {
			loanlink.click();
			
	}
	
	
	
	
	
	
	
	
}
