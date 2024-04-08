package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SubmissionBoundPage extends BaseClass {

	public SubmissionBoundPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id='JobComplete:JobCompleteScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//div[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']")
	private WebElement viewPolicy;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getViewPolicy() {
		return viewPolicy;
	}
	
	public void viewYourPolicy() {
		WebElement Vpolicy =getViewPolicy();
		click(Vpolicy);
	}
}
