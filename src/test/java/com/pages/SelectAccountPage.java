package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectAccountPage extends BaseClass {

	public SelectAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='NewSubmission:NewSubmissionScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:Account-inputEl']")
	private WebElement accNumber;
	@FindBy(xpath = "//input[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:Producer-inputEl']")
	private WebElement orgTab;
	@FindBy(xpath = "//div[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:AccountName-inputEl']")
	private WebElement accName;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getAccNumber() {
		return accNumber;
	}

	public WebElement getOrgTab() {
		return orgTab;
	}

	public WebElement getAccName() {
		return accName;
	}

	public void searchAndSelectAccount(String AccNo) throws InterruptedException {
		WebElement NoAcc = getAccNumber();
		sendKeys(NoAcc, AccNo);
		WebElement tabOrg = getOrgTab();
		click(tabOrg);
		unconditionalWait(2000);
		WebElement nameAcc = getAccName();
		click(nameAcc);
	}
}
