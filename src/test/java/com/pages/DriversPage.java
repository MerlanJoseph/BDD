package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DriversPage extends BaseClass {

	public DriversPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text() ='Drivers']")
	private WebElement successMsg;
	@FindBy(xpath = "//input[@id ='BADriverPopup:BADriverScreen:BADriversDV:GlobalPersonNameInputSet:FirstName-inputEl']")
	private WebElement fName;
	@FindBy(xpath = "//input[@id ='BADriverPopup:BADriverScreen:BADriversDV:GlobalPersonNameInputSet:LastName-inputEl']")
	private WebElement lName;
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnEl']")
	private WebElement btnAdd;
	@FindBy(xpath = "//span[@id ='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BADriversScreen:BADriversScreenToolbar:AddDriverDirectly-btnInnerEl']")
	private WebElement addDriverCA;
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact-textEl']")
	private WebElement existingDriver;
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:AddExistingContact:0:UnassignedDriver-textEl']")
	private WebElement accHolder;
	@FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl']")
	private WebElement DOB;
	@FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseNumber-inputEl']")
	private WebElement licenseNo;
	@FindBy(xpath = "//div[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseState-inputWrap']")
	private WebElement lsDDIcon;
	@FindBy(xpath = "//li[@class='x-boundlist-item' and text()='Arizona']")
	private WebElement licenseState;
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:RolesCardTab-btnInnerEl']")
	private WebElement btnRoles;
	@FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:1:PolicyContactRolePanelSet:PolicyDriverInfoDV:yearlicensed-inputEl']")
	private WebElement yfLicensed;
	@FindBy(xpath = "(//div[@id='centerPanel']//tr//td//div//table[@class='x-grid-item']//div)[2]")
	private WebElement accidentsNoPL;
	@FindBy(xpath = "(//div[@id='centerPanel']//tr//td//div//table[@class='x-grid-item x-grid-item-alt']//div)[2]")
	private WebElement violationsNoPL;
	@FindBy(xpath = "(//div[@id='centerPanel']//tr//td//div//table[@class='x-grid-item']//div)[3]")
	private WebElement accidentsNoAL;
	@FindBy(xpath = "(//div[@id='centerPanel']//tr//td//div//table[@class='x-grid-item x-grid-item-alt']//div)[3]")
	private WebElement violationsNoAL;
	@FindBy(xpath = "//img[@class='x-grid-checkcolumn ']")
	private WebElement radioBtn;
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:RetrieveMVRButton-btnInnerEl']")
	private WebElement retrieveMVRBtn;
	@FindBy(xpath = "//td[@class='x-grid-cell x-grid-td x-grid-cell-gridcolumn-1530']//div")
	private WebElement MVRStatus;
	@FindBy(xpath = "//span[@id='SubmissionWizard:Next-btnInnerEl']")
	private WebElement btnNext;
	@FindBy(xpath = "//input[@id ='BADriverPopup:BADriverScreen:BADriversDV:Gender-inputEl']")
	private WebElement gender;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}
public WebElement getaddDriverCA() {
	return addDriverCA;
}
	public WebElement getExistingDriver() {
		return existingDriver;
	}

	public WebElement getAccHolder() {
		return accHolder;
	}

	public WebElement getDOB() {
		return DOB;
	}

	public WebElement getLicenseNo() {
		return licenseNo;
	}

	public WebElement getLsDDIcon() {
		return lsDDIcon;
	}

	public WebElement getLicenseState() {
		return licenseState;
	}

	public WebElement getBtnRoles() {
		return btnRoles;
	}

	public WebElement getYfLicensed() {
		return yfLicensed;
	}

	public WebElement getAccidentsNoPL() {
		return accidentsNoPL;
	}

	public WebElement getViolationsNoPL() {
		return violationsNoPL;
	}

	public WebElement getAccidentsNoAL() {
		return accidentsNoAL;
	}

	public WebElement getViolationsNoAL() {
		return violationsNoAL;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getRetrieveMVRBtn() {
		return retrieveMVRBtn;
	}

	public WebElement getMVRStatus() {
		return MVRStatus;
	}

	public WebElement getBtnNext() {
		return btnNext;
		}
	
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	
	public WebElement getGender() {
		return gender;
    }
	public void addDriver() {
		WebElement addDrivers = getaddDriverCA();
		click(addDrivers);
	}

	public void selectAccHolderForDriver() throws InterruptedException {
		WebElement addBtn = getBtnAdd();
		click(addBtn);
		WebElement driverExisting = getExistingDriver();
		click(driverExisting);
		unconditionalWait(2000);
		WebElement holderOfAcc = getAccHolder();
		click(holderOfAcc);
	}

	public void enterContactDetails(String fname, String lname, String gender, String DOB, String licenseNo, String licenseState) throws InterruptedException {
		unconditionalWait(2000);
		WebElement firstName =getfName();
		sendKeys(firstName, fname);
		WebElement lastName = getlName();
		sendKeys(lastName, lname);
		WebElement genderType = getGender();
		sendKeys(genderType, gender);
		WebElement dob = getDOB();
		clear(dob);
		sendKeys(dob, DOB);
		WebElement noLicense = getLicenseNo();
		sendKeys(noLicense, licenseNo);
		unconditionalWait(2000);
		WebElement DDIconLS = getLsDDIcon();
		click(DDIconLS);
		
	 WebElement stateLicense = getLicenseState();
     click(stateLicense);
	}

	public void enterDetailsInRoles(String year, String PLNoAccidents, String ALNoAccidents, String PLNoViolations,
			String ALNoViolations) throws InterruptedException {
		WebElement rolesBtn = getBtnRoles();
		click(rolesBtn);
		unconditionalWait(2000);
		WebElement licensedYear = getYfLicensed();
		sendKeys(licensedYear, year);
		unconditionalWait(2000);
		WebElement PLAccidentsNo = getAccidentsNoPL();
		sendKeysByJS(PLAccidentsNo, PLNoAccidents);
		WebElement ALAccidentsNo = getAccidentsNoAL();
		sendKeysByJS(ALAccidentsNo, ALNoAccidents);
		WebElement PLViolationsNo = getViolationsNoPL();
		sendKeysByJS(PLViolationsNo, PLNoViolations);
		WebElement ALViolationsNo = getViolationsNoAL();
		sendKeysByJS(ALViolationsNo, ALNoViolations);
		unconditionalWait(2000);
		WebElement btnRadio = getRadioBtn();
		click(btnRadio);
		WebElement btnRetriveMVR = getRetrieveMVRBtn();
		click(btnRetriveMVR);
	}

	public void clickNext() {
		WebElement nextBtn = getBtnNext();
		click(nextBtn);
	}

}
