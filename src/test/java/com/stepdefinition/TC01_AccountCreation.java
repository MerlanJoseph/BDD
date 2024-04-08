package com.stepdefinition;

import io.cucumber.java.en.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.junit.Assert;

import com.base.BaseClass;
import com.pom.PageObjectManager;

public class TC01_AccountCreation extends BaseClass {
	static String accNumberPerson;
	static String accNumberCompany;
	String accNamePerson;
	String accNameCompany;
	PageObjectManager pom = new PageObjectManager();

	@Given("User is on Login Page")
	public void user_is_on_login_page() {

	}

	@When("User enter valid credentials and click login")
	public void user_enter_valid_credentials_and_click_login(Map<String, String> dataTable) throws FileNotFoundException, IOException {
		pom.getLoginPage().login();
	}

	@Then("User should verify {string} in Dashboard page")
	public void user_should_verify_in_dashboard_page(String expected) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getDashboardPage().getActionsMenu().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("User click New Account in Actions menu")
	public void user_click_new_account_in_actions_menu() {
		pom.getDashboardPage().clickNewAccount();
	}

	@Then("User should verify {string} in Applicant Information page")
	public void user_should_verify_in_applicant_information_page(String expected) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getApplicantInformationPage().getSuccessMsg().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("User enter {string} and {string} click search")
	public void user_enter_and_click_search(String firstname, String lastname) {
		String firstName = generateRandomString(4);
		String lastName = generateRandomNumber(3);
		accNamePerson = firstName + " " + lastName;
		pom.getApplicantInformationPage().searchAccountPerson(firstName, lastName);
	}

	@Then("User should view {string} in Applicant Information page")
	public void user_should_view_in_applicant_information_page(String expected) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getApplicantInformationPage().getSearchResultMsg().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("User click Person in Create New Account dropdown")
	public void user_click_person_in_create_new_account_dropdown() {
		pom.getApplicantInformationPage().createPersonAccount();
	}

	@Then("User should verify {string} in Create Account page")
	public void user_should_verify_in_create_account_page(String expected) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getCreateAccountPage().getSuccessMsg().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("User click search icon in Organization column")
	public void user_click_search_icon_in_organization_column() {
		pom.getCreateAccountPage().orgSearch();
	}

	@Then("User should view {string} in Organizations page")
	public void user_should_view_in_organizations_page(String expected) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getOrganizationsPage().getSuccessMsg().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("User enter {string} and click Select in Search Results")
	public void user_enter_and_click_select_in_search_results(String org) throws InterruptedException {
		pom.getOrganizationsPage().selectOrg(org);
	}

	@When("User enter all mandatory fields and click Update")
	public void user_enter_all_mandatory_fields_and_click_update(Map<String, String> dataTable)
			throws InterruptedException {
		if (dataTable.containsValue("123 ABC")) {
			pom.getCreateAccountPage().enterMandatoryFieldsForPerson(dataTable.get("Address 1"),
					dataTable.get("ZIP Code"), dataTable.get("Address Type"), dataTable.get("Producer Code"));
		} else {
			pom.getCreateAccountPage().enterMandatoryFieldsForCompany(dataTable.get("Address 1"),
					dataTable.get("ZIP Code"), dataTable.get("Address Type"), dataTable.get("Producer Code"));
		}
	}

	@Then("User should verify {string} in Account Summary page and save Account Number")
	public void user_should_verify_in_account_summary_page_and_save_account_number(String accountname)
			throws InterruptedException {
		if ((pom.getAccountSummaryPage().getAddressType().getText()).equalsIgnoreCase("Home")) {
			unconditionalWait(3000);
			String actual = pom.getAccountSummaryPage().getAccName().getText();
			Assert.assertEquals(accNamePerson, actual);
			accNumberPerson = pom.getAccountSummaryPage().saveAccPersonNo();
		} else {
			unconditionalWait(3000);
			String actual = pom.getAccountSummaryPage().getAccName().getText();
			Assert.assertEquals(accNameCompany, actual);
			accNumberCompany = pom.getAccountSummaryPage().saveAccPersonNo();
		}
	} 

	@When("User enter {string} and click search")
	public void user_enter_and_click_search(String name) {
		accNameCompany = generateRandomString(2) + " " + "Ins.";
		pom.getApplicantInformationPage().searchAccountCompany(accNameCompany);
	}

	@When("User click Company in Create New Account dropdown")
	public void user_click_company_in_create_new_account_dropdown() {
		pom.getApplicantInformationPage().createCompanyAccount();
	}

}
