package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ApplicantInformationPage extends BaseClass {
	public ApplicantInformationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Enter Account Information']")
	private WebElement successMsg;
	@FindBy(xpath = "//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl']")
	private WebElement companyName;
	@FindBy(xpath = "//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:FirstName-inputEl']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalPersonNameInputSet:LastName-inputEl']")
	private WebElement lastName;
	@FindBy(xpath = "//a[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
	private WebElement btnSearch;
	@FindBy(xpath = "//div[text()='The search returned zero results.']")
	private WebElement searchResultMsg;
	@FindBy(xpath = "//span[@id='NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl']")
	private WebElement createNewAccount;
	@FindBy(xpath = "//span[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-textEl']")
	private WebElement btnPerson;
	@FindBy(xpath = "//span[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Company-textEl']")
	private WebElement btnCompany;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getSearchResultMsg() {
		return searchResultMsg;
	}

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getBtnPerson() {
		return btnPerson;
	}

	public WebElement getBtnCompany() {
		return btnCompany;
	}

	public void searchAccountPerson(String first, String last) {
		WebElement nameFirst = getFirstName();
		sendKeys(nameFirst, first);
		WebElement nameLast = getLastName();
		sendKeys(nameLast, last);
		WebElement searchBtn = getBtnSearch();
		click(searchBtn);
	}

	public void searchAccountCompany(String name) {
		WebElement nameCompany = getCompanyName();
		sendKeys(nameCompany, name);
		WebElement searchBtn = getBtnSearch();
		click(searchBtn);
	}

	public void createPersonAccount() {
		WebElement newAccountCreate = getCreateNewAccount();
		click(newAccountCreate);
		WebElement personBtn = getBtnPerson();
		click(personBtn);
	}
	
	public void createCompanyAccount() {
		WebElement newAccountCreate = getCreateNewAccount();
		click(newAccountCreate);
		WebElement companyBtn = getBtnCompany();
		click(companyBtn);
	}

}
