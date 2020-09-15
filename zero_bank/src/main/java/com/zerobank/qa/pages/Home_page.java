package com.zerobank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.qa.base.testbase;

public class Home_page extends testbase {
	
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
	@FindBy(xpath="//a[@href='/forgot-password.html']") 
	private static WebElement forgotpasswordlink;
	
	@FindBy(xpath="//input[@type='text']") 
	private static WebElement emailtext;
	
	@FindBy(xpath="//input[@type='submit']")
	private static WebElement sendpasswordbutton;
	


      public Home_page () {
	PageFactory.initElements(driver, this);
	}

      
      
      
      
      
//      public  void clicksigninbutton() 
//      {
//  		signinbutton.click();
//      }
//      public   void clickloginbutton()
//      {
// 		 loginbutton.sendKeys("username");
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
//      
      
		public   void clickforgotlink() {
			forgotpasswordlink.click();		
	}
		public   void writeemailtext() {
			emailtext.sendKeys("sudhir@gmail.com");
			
	}
		public   void clicksendpassbutton() {
			sendpasswordbutton.click();
			
	}
	
	 

}