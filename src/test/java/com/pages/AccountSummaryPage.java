package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AccountSummaryPage extends BaseClass {

	public AccountSummaryPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='AccountFile_Summary:AccountFile_SummaryScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//div[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:Name-inputEl']")
	private WebElement accName;
	@FindBy(xpath = "//div[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl']")
	private WebElement accNumber;
	@FindBy(xpath = "//div[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:AddressType-inputEl']")
	private WebElement addressType;
	@FindBy(xpath = "//span[@id='AccountFile:AccountFileMenuActions-btnInnerEl']")
	private WebElement actionsMenu;
	@FindBy(xpath = "//span[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-textEl']")
	private WebElement newSubmission;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getAccName() {
		return accName;
	}

	public WebElement getAccNumber() {
		return accNumber;
	}

	public WebElement getAddressType() {
		return addressType;
	}

	public WebElement getActionsMenu() {
		return actionsMenu;
	}

	public WebElement getNewSubmission() {
		return newSubmission;
	}

	public String saveAccPersonNo() {
		WebElement accNo = getAccNumber();
		String txt = getText(accNo);
		return txt;
	}
	
	public void clickNewSubmission() {
		WebElement actions = getActionsMenu();
		click(actions);
		WebElement submissionNew = getNewSubmission();
		click(submissionNew);
	}
}
