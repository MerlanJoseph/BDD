package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class OrganizationsPage extends BaseClass {

	public OrganizationsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//input[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:GlobalContactNameInputSet:Name-inputEl']")
	private WebElement orgName;
	@FindBy(xpath = "//a[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
	private WebElement btnSearch;
	@FindBy(xpath = "//a[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select']")
	private WebElement btnSelect;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getBtnSelect() {
		return btnSelect;
	}

	public void selectOrg(String org) throws InterruptedException {
		WebElement nameOrg = getOrgName();
		sendKeys(nameOrg, org);
		WebElement searchBtn = getBtnSearch();
		click(searchBtn);
		unconditionalWait(4000);
		WebElement selectBtn = getBtnSelect();
		click(selectBtn);
	}

}
