package com.zerobank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zerobank.qa.base.testbase;

public class Feedback_page extends testbase {

	@FindBy(xpath = "//strong[text()='Feedback']")
	private static WebElement feedbackbuttonlink;

	@FindBy(xpath = "//input[@name='name']")
	private static WebElement textfield;

	@FindBy(xpath = "//input[@name='email']")
	private static WebElement emailfield;

	@FindBy(xpath = "//input[@name='subject']")
	private static WebElement subjectfield;

	@FindBy(xpath = "//textarea[@type='text']")
	private static WebElement textareafield;

	@FindBy(xpath = "//input[@value='Send Message']")
	private static WebElement sendsmsbutn;

	public Feedback_page() {

		PageFactory.initElements(driver, this);
	}

	public void clickfeedbacklink() {
		feedbackbuttonlink.click();
	}

	public void clickname() {
		textfield.sendKeys("sam");
	}

	public void clickemailfield() {
		emailfield.sendKeys("samyeeee@gmail.com");
	}

	public void clicksubjectfield() {
		subjectfield.sendKeys("for credit card");
	}

	public void clicktextareafield() {
		textareafield.sendKeys("for credit card");
	}

	public void clicksendsmsbtn() {
		sendsmsbutn.click();
	}

}
