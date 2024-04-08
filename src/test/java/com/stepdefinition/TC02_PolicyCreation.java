package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pom.PageObjectManager;

import io.cucumber.java.en.*;

public class TC02_PolicyCreation extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on Dashboard page by login with valid credentials")
	public void user_is_on_dashboard_page_by_login_with_valid_credentials(Map<String, String> dataTable)
			throws FileNotFoundException, IOException {
		pom.getLoginPage().login();
	}

	@When("User click New Submission in Actions menu")
	public void user_click_new_submission_in_actions_menu() throws InterruptedException {
		pom.getDashboardPage().clickNewSubmission();
	}

	@Then("User should verify {string} in Select Account page")
	public void user_should_verify_in_select_account_page(String expected) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getSelectAccountPage().getSuccessMsg().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("User search account by Account Number and select existing account")
	public void user_search_account_by_account_number_and_select_existing_account() throws InterruptedException {
		pom.getSelectAccountPage().searchAndSelectAccount(TC01_AccountCreation.accNumberCompany);	
	 //TC01_AccountCreation.accNumberPerson
	}

	@Then("User should view {string} in Account Summary page")
	public void user_should_view_in_account_summary_page(String expected) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getAccountSummaryPage().getSuccessMsg().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("User click New Submission in Actions menu on Account Summary page")
	public void user_click_new_submission_in_actions_menu_on_account_summary_page() {
		pom.getAccountSummaryPage().clickNewSubmission();
	}

//	@Then("User should verify {string} in LOB page")
//	public void user_should_verify_in_lob_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getLOBPage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User select Personal Auto LOB in LOB page")
//	public void user_select_personal_auto_lob_in_lob_page() {
//		pom.getLOBPage().selectPALOB();
//	}
//
//	@Then("User should view {string} in Offering page")
//	public void user_should_view_in_offering_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getOfferingsPage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User select Basic Program in Offering Selection and click Next")
//	public void user_select_basic_program_in_offering_selection_and_click_next() {
//		pom.getOfferingsPage().selectOffering();
//	}
//
//	@Then("User should verify {string} in Qualification page")
//	public void user_should_verify_in_qualification_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getQualificationPage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User click Next in Qualification page")
//	public void user_click_next_in_qualification_page() {
//		pom.getQualificationPage().clickNext();
//	}
//
//	@Then("User should view {string} in Policy Info page")
//	public void user_should_view_in_policy_info_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getPolicyInfoPage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User click Next in Policy Info page")
//	public void user_click_next_in_policy_info_page() {
//		pom.getPolicyInfoPage().clickNext();
//	}
//
//	@Then("User should view {string} in Drivers page")
//	public void user_should_view_in_drivers_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getDriversPage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User select Account Holder from Existing Driver in Add dropdown")
//	public void user_select_account_holder_from_existing_driver_in_add_dropdown() throws InterruptedException {
//		pom.getDriversPage().selectAccHolderForDriver();
//	}
//
//	@When("User enter contact details of driver")
//	public void user_enter_contact_details_of_driver(Map<String, String> dataTable) throws InterruptedException {
//		pom.getDriversPage().enterContactDetails(dataTable.get("Date of Birth"), dataTable.get("License No."),
//				dataTable.get("License State"));
//	}
//
//	@When("User enter details in roles and Retrive MVR")
//	public void user_enter_details_in_roles_and_retrive_mvr(Map<String, String> dataTable) throws InterruptedException {
//		pom.getDriversPage().enterDetailsInRoles(dataTable.get("Year First Licensed"),
//				dataTable.get("Number of Accidents"), dataTable.get("Number of Accidents"),
//				dataTable.get("Number of Violations"), dataTable.get("Number of Violations"));
//	}
//
//	@Then("User should verify MVR Status {string}")
//	public void user_should_verify_mvr_status(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getDriversPage().getMVRStatus().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User click Next in Drivers page")
//	public void user_click_next_in_drivers_page() {
//		pom.getDriversPage().clickNext();
//	}
//
//	@Then("User should view {string} in Vehicles page")
//	public void user_should_view_in_vehicles_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getVehiclesPage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User click Create Vehicle enter mandatory details")
//	public void user_click_create_vehicle_enter_mandatory_details(Map<String, String> dataTable) {
//		pom.getVehiclesPage().createVehicleByEntersMandatoryFields(dataTable.get("VIN"), dataTable.get("License State"),
//				dataTable.get("Cost New"));
//	}
	
	
//
//	@When("User Assign driver in Add dropdown and click Next")
//	public void user_assign_driver_in_add_dropdown_and_click_next() {
//		pom.getVehiclesPage().assignDriver();
//	}
//
//	@Then("User should view {string} in Coverages page")
//	public void user_should_view_in_coverages_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getPACoveragesPage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User click Next in Coverages page")
//	public void user_click_next_in_coverages_page() {
//		pom.getPACoveragesPage().clickNext();
//	}
//
//	@Then("User should view {string} in Risk Analysis page")
//	public void user_should_view_in_risk_analysis_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getRAPage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User click Next in Risk Analysis page")
//	public void user_click_next_in_risk_analysis_page() {
//		pom.getRAPage().clickNext();
//	}
//
//	@Then("User should view {string} in Policy Review page")
//	public void user_should_view_in_policy_review_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getPolicyReviewPage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User click Quote in Policy Review page")
//	public void user_click_quote_in_policy_review_page() {
//		pom.getPolicyReviewPage().clickQuote();
//	}
//
//	@Then("User should view {string} in Quote page")
//	public void user_should_view_in_quote_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//		String actual = pom.getQuotePage().getSuccessMsg().getText();
//		Assert.assertEquals(expected, actual);
//	}
//
//	@When("User click Issue Policy in Bind Options dropdown and click OK")
//	public void user_click_issue_policy_in_bind_options_dropdown_and_click_ok() {
//
//	}
//
//	@Then("User should view {string} in Submission Bound page")
//	public void user_should_view_in_submission_bound_page(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//	}
//
//	@When("User click View Your Policy in Submission Bound page")
//	public void user_click_view_your_policy_in_submission_bound_page() {
//
//	}
//
//	@Then("User should verify {string} and save Policy Number")
//	public void user_should_verify_and_save_policy_number(String expected) throws InterruptedException {
//		unconditionalWait(3000);
//	}
	
	@Then("User should verify {string} in LOB page")
	public void user_should_verify_in_lob_page(String expectedstring)  throws InterruptedException{
		unconditionalWait(3000);
		String actual = pom.getLOBPage().getCASuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}
	    
	

	@When("User select Commercial Auto LOB in LOB page")
	public void user_select_commercial_auto_lob_in_lob_page() {
		pom.getLOBPage().selectCALOB();
	}

	@Then("User should view {string} in Offering page")
	public void user_should_view_in_offering_page(String expectedstring)throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getOfferingsPage().getSuccessMsg().getText();
	Assert.assertEquals(expectedstring, actual);
	}

	@When("User select Standard in Offering Selection and click Next")
	public void user_select_standard_in_offering_selection_and_click_next() throws InterruptedException {
		pom.getOfferingsPage().selectstdOffering();
	}

	@Then("User should verify {string} in Qualification page")
	public void user_should_verify_in_qualification_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getQualificationPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}

	@When("User click Next in Qualification page")
	public void user_click_next_in_qualification_page() {
		pom.getQualificationPage().clickNext();
	}

	@Then("User should view {string} in Policy Info page") 
	public void user_should_view_in_policy_info_page(String expectedstring) throws InterruptedException{
		unconditionalWait(3000);
		String actual = pom.getPolicyInfoPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}
	
	@Then("User enter organization Common ownership type")
	public void user_enter_organization_COmmon_ownership_type() throws InterruptedException 
	{
		pom.getPolicyInfoPage().enterMandatoryFieldsForOrganization();
		
	}
	

	@When("User click Next in Policy Info page")
	public void user_click_next_in_policy_info_page() {
		pom.getPolicyInfoPage().clickNext();
	}

	@Then("User should verify {string} in Commercial Auto Line page")
	public void user_should_verify_in_commercial_auto_line_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getCommercialAutoLinePage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}
	

	@When("User enter mandatory details in Commercial Auto Line Page and click Next")
	public void user_enter_mandatory_details_in_commercial_auto_line_page_and_click_next(Map<String, String> dataTable) throws InterruptedException {
		pom.getCommercialAutoLinePage().selectProductAndfleetAndliability(dataTable.get("Product"), dataTable.get("Fleet"));
	}

	@Then("User should view {string} in Location Details page")
	public void user_should_view_in_location_details_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getLocationsPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}

	@When("User click Next in Location Details page")
	public void user_click_next_in_location_details_page() {
		pom.getLocationsPage().clickNext();
	}

	@Then("User should view {string} in Vehicles page")
	public void user_should_view_in_vehicles_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getVehiclesPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}

	@When("User click Create Vehicle")
	public void user_click_create_vehicle() {
	    pom.getVehiclesPage().createVehicle();
	}

	@Then("User verify {string} in Vehicle Information page")  
	public void user_verify_in_vehicle_information_page(String expectedstring) throws InterruptedException  {
		unconditionalWait(3000);
		String actual = pom.getVehicleInformationPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	    
	}

	@When("User enter mandatory details")
	public void user_enter_mandatory_details(Map<String, String> dataTable) {
		pom.getVehicleInformationPage().EntersMandatoryFields(dataTable.get("garagedAt"), dataTable.get("vehicleType"),
			dataTable.get("VIN"), dataTable.get("License State"), dataTable.get("Cost New"));
	    
	}

	@When("User click Search in Class column")
	public void user_click_search_in_class_column() {
	    pom.getVehicleInformationPage().clickSearch();
	}

	@Then("User should view {string} in VCC Search page")
	public void user_should_view_in_vcc_search_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getVccSearchPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	    
	}

	@When("User select Size Class dropdown click Search and select")
	public void user_select_size_class_dropdown_click_search_and_select(String size) {
		pom.getVccSearchPage().vccSearch(size);
	  
	}

	@Then("User should verify {string} in Vehicle Information page")
	public void user_should_verify_in_vehicle_information_page(String expectedstring) throws InterruptedException  {
		unconditionalWait(3000);
		String actual = pom.getVehicleInformationPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}

	@When("User click OK in Vehicle Information page")
	public void user_click_ok_in_vehicle_information_page() {
	   pom.getVehicleInformationPage().clickOkButn();
	}

	@When("User click Next in Vehicles page")
	public void user_click_next_in_vehicles_page() throws InterruptedException {
	    pom.getVehiclesPage().nextBtn();
	}

	@Then("User veiw {string} in State Info page")
	public void user_veiw_in_state_info_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getStateInfoPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}

	@When("User click Next in State Info page")
	public void user_click_next_in_state_info_page() {
	    pom.getStateInfoPage().clickNext();
	}

	@Then("User should view {string} in Drivers page")
	public void user_should_view_in_drivers_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getDriversPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	
	}

	@When("User click Add Driver")
	public void user_click_add_driver() {
	    pom.getDriversPage().addDriver();
	}

	@Then("User should view {string} in Driver Details page")
	public void user_should_view_in_driver_details_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getDriverDetailsPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	
	}

	@When("User enter mandatory details and click OK")
	public void user_enter_mandatory_details_and_click_ok(Map<String, String> dataTable ) throws InterruptedException{
	    pom.getDriverDetailsPage().mandatoryDetails(dataTable.get("First name"), dataTable.get("Last name"), dataTable.get("Gender"),dataTable.get("Date of Birth"), dataTable.get("License No."), 
	    		dataTable.get("LicenseState"),dataTable.get("License Year"));
	}

	@When("User click Next in Drivers page")
	public void user_click_next_in_drivers_page() {
	   pom.getDriversPage().clickNext();
	}

	@Then("User should view {string} in Covered Vehicles page")
	public void user_should_view_in_covered_vehicles_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getCACoveragesPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	
	}

	@When("User click Next in Covered Vehicles page")
	public void user_click_next_in_covered_vehicles_page() {
	   pom.getCACoveragesPage().ClickNextBtn();
	}

	@Then("User should view {string} in Modifiers page")
	public void user_should_view_in_modifiers_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getModifiersPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}

	@When("User click Next in Modifiers page")
	public void user_click_next_in_modifiers_page() {
	   pom.getModifiersPage().ClickNextBtn();
	}

	@Then("User should view {string} in Risk Analysis page")
	public void user_should_view_in_risk_analysis_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getRAPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}

	@When("User click Next in Risk Analysis page")
	public void user_click_next_in_risk_analysis_page() {
	    pom.getRAPage().clickNext();
	}

	@Then("User should view {string} in Policy Review page")
	public void user_should_view_in_policy_review_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getPolicyReviewPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}

	@When("User click Quote in Policy Review page")
	public void user_click_quote_in_policy_review_page() {
	  pom.getPolicyReviewPage().clickQuote();
	}

	@Then("User should view {string} in Quote page")
	public void user_should_view_in_quote_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getQuotePage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}
	

	@When("User click Issue Policy in Bind Options dropdown and click OK")
	public void user_click_issue_policy_in_bind_options_dropdown_and_click_ok() {
	    pom.getQuotePage().bindAndIssue();
	}

	@Then("User should view {string} in Submission Bound page")
	public void user_should_view_in_submission_bound_page(String expectedstring) throws InterruptedException {
		unconditionalWait(3000);
		String actual = pom.getSubBoundPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);
	}

	@When("User click View Your Policy in Submission Bound page")
	public void user_click_view_your_policy_in_submission_bound_page() {
	    pom.getSubBoundPage().viewYourPolicy();
	}

	@Then("User should verify {string} and save Policy Number")
	public void user_should_verify_and_save_policy_number(String expectedstring)throws InterruptedException  {
		unconditionalWait(3000);
		String actual = pom.getPolicySummaryPage().getSuccessMsg().getText();
		Assert.assertEquals(expectedstring, actual);

}
}
