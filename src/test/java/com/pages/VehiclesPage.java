package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class VehiclesPage extends BaseClass {

	public VehiclesPage() {
		PageFactory.initElements(driver, this);
	}
	//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BAVehiclesScreen:ttlBar']
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BAVehiclesScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//a[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BAVehiclesScreen:BAVehiclesLV_tb:Add']")
	private WebElement btnCreateVehicle;
	@FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Vin_DV-inputEl']")
	private WebElement VIN;
	@FindBy(xpath = "//div[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicenseState_DV-trigger-picker']")
	private WebElement lsDDIcon;
	@FindBy(xpath = "//li[text()='Arizona']")
	private WebElement licenseState;
	@FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:CostNew_DV-inputEl']")
	private WebElement costNew;
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl']")
	private WebElement btnAdd;
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl']")
	private WebElement drive;
	@FindBy(xpath = "//span[text()='Next >']")
	private WebElement btnNext;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getBtnCreateVehicle() {
		return btnCreateVehicle;
	}

	public WebElement getVIN() {
		return VIN;
	}

	public WebElement getLsDDIcon() {
		return lsDDIcon;
	}

	public WebElement getLicenseState() {
		return licenseState;
	}

	public WebElement getCostNew() {
		return costNew;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public WebElement getDriver() {
		return drive;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}
	
	public void createVehicle() {
		WebElement createVehicleBtn = getBtnCreateVehicle();
		click(createVehicleBtn);
	}
	
	public void createVehicleByEntersMandatoryFields(String VIN, String licenseState, String costNew) {
		WebElement createVehicleBtn = getBtnCreateVehicle();
		click(createVehicleBtn);
		WebElement VINNo = getVIN();
		sendKeys(VINNo, VIN);
		WebElement DDIconLS = getLsDDIcon();
		click(DDIconLS);
		WebElement stateLicense = getLicenseState();
		click(stateLicense);
		WebElement newCost = getCostNew();
		sendKeys(newCost, costNew);
	}
	
	public void assignDriver() {
		WebElement addBtn = getBtnAdd();
		click(addBtn);
		WebElement driver = getDriver();
		click(driver);
		WebElement nextBtn = getBtnNext();
		click(nextBtn);
	}
	
	public void nextBtn() throws InterruptedException {
		WebElement nextBtn = getBtnNext();
		unconditionalWait(2000);
		click(nextBtn);
	}
}
