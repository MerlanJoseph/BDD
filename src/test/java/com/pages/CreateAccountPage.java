package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CreateAccountPage extends BaseClass {

	public CreateAccountPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='CreateAccount:CreateAccountScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//label[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
	private WebElement address1;
	@FindBy(xpath = "//input[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']")
	private WebElement zipcode;
	@FindBy(xpath = "//div[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-trigger-picker']")
	private WebElement atDDIcon;
	@FindBy(xpath = "//li[text()='Home']")
	private WebElement addressTypeHome;
	@FindBy(xpath = "//li[text()='Business']")
	private WebElement addressTypeBusiness;
	@FindBy(xpath = "//div[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization']")
	private WebElement orgSearch;
	@FindBy(xpath = "//div[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode-trigger-picker']")
	private WebElement pcDDIcon;
	@FindBy(xpath = "//li[text()='INT-3 Internal Producer Code - 3']")
	private WebElement producerCodePerson;
	@ FindBy(xpath = "//li[text()='Standard Code Internal Producer Code - 1']")
	private WebElement producerCodeCompany;
	@FindBy(xpath = "//span[@id='CreateAccount:CreateAccountScreen:Update-btnInnerEl']")
	private WebElement btnUpdate;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getAtDDIcon() {
		return atDDIcon;
	}

	public WebElement getAddressTypeHome() {
		return addressTypeHome;
	}

	public WebElement getAddressTypeBusiness() {
		return addressTypeBusiness;
	}

	public WebElement getOrgSearch() {
		return orgSearch;
	}

	public WebElement getPcDDIcon() {
		return pcDDIcon;
	}

	public WebElement getProducerCodePerson() {
		return producerCodePerson;
	}

	public WebElement getProducerCodeCompany() {
		return producerCodeCompany;
	}

	public WebElement getBtnUpdate() {
		return btnUpdate;
	}

	public void orgSearch() {
		WebElement searchOrg = getOrgSearch();
		click(searchOrg);
	}

	public void enterMandatoryFieldsForPerson(String address1, String zipcode, String addType, String proCode)
			throws InterruptedException {
		implicitlyWait();
		WebElement add1 = getAddress1();
		sendKeys(add1, address1);
		WebElement zip = getZipcode();
		sendKeys(zip, zipcode);
		clickByEnterKey();
		WebElement atDD = getAtDDIcon();
		clickByJS(atDD);
		unconditionalWait(2000);
		WebElement addressType = getAddressTypeHome();
		clickByJS(addressType);
		WebElement pcDD = getPcDDIcon();
		click(pcDD);
		unconditionalWait(2000);
		WebElement producerCode = getProducerCodePerson();
		click(producerCode);
		WebElement updateBtn = getBtnUpdate();
		click(updateBtn);
	}
	
	public void enterMandatoryFieldsForCompany(String address1, String zipcode, String addType, String proCode)
			throws InterruptedException {
		implicitlyWait();
		WebElement add1 = getAddress1();
		sendKeys(add1, address1);
		WebElement zip = getZipcode();
		sendKeys(zip, zipcode);
		clickByEnterKey();
		WebElement atDD = getAtDDIcon();
		clickByJS(atDD);
		unconditionalWait(2000);
		WebElement addressType = getAddressTypeBusiness();
		clickByJS(addressType);
		WebElement pcDD = getPcDDIcon();
		click(pcDD);
		unconditionalWait(2000);
		WebElement producerCode = getProducerCodeCompany();
		click(producerCode);
		WebElement updateBtn = getBtnUpdate();
		click(updateBtn);
	}

}
