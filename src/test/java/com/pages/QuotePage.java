package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class QuotePage extends BaseClass {

	public QuotePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//span[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl']")
	private WebElement bindOptionsDD;
	@FindBy(xpath = "//span[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:BindAndIssue-textEl']")
	private WebElement btnIssuePolicy;
	@FindBy(xpath = "//span[@id='button-1005-btnInnerEl']")
	private WebElement btnOK;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getBindOptionsDD() {
		return bindOptionsDD;
	}

	public WebElement getBtnIssuePolicy() {
		return btnIssuePolicy;
	}

	public WebElement getBtnOK() {
		return btnOK;
	}
	public void bindAndIssue() {
		WebElement bind = getBindOptionsDD();
		click(bind);
		WebElement issue = getBtnIssuePolicy();
		click(issue);
		WebElement okBtn = getBtnOK();
		click(okBtn);
		
	}
	
}
