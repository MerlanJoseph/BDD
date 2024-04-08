package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PolicySummaryPage extends BaseClass {

	public PolicySummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Policy File']")
	private WebElement successMsg;
	@FindBy(xpath = "//div[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:PolicyNumber-inputEl']")
	private WebElement policyNo;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getPolicyNo() {
		return policyNo;
	}
	
}
