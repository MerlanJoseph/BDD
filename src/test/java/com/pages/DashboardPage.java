package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DashboardPage extends BaseClass {
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Actions']")
	private WebElement actionsMenu;
	@FindBy(xpath = "//span[text()='New Account']")
	private WebElement newAccount;
	@FindBy(xpath = "//span[text()='New Submission']")
	private WebElement newSubmission;

	public WebElement getActionsMenu() {
		return actionsMenu;
	}

	public WebElement getNewAccount() {
		return newAccount;
	}

	public WebElement getNewSubmission() {
		return newSubmission;
	}
	
	public void clickNewAccount() {
		WebElement actions = getActionsMenu();
		click(actions);
		WebElement accountNew = getNewAccount();
		click(accountNew);
	}
	
	public void clickNewSubmission() throws InterruptedException {
		unconditionalWait(2000);
		WebElement actions = getActionsMenu();
		click(actions);
		WebElement submissionNew = getNewSubmission();
		click(submissionNew);
	}
}
