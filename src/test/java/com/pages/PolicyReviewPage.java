package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PolicyReviewPage extends BaseClass {

	public PolicyReviewPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//span[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']")
	private WebElement btnQuote;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getBtnQuote() {
		return btnQuote;
	}
	
	public void clickQuote() {
		WebElement quoteBtn = getBtnQuote();
		click(quoteBtn);
	}

}
