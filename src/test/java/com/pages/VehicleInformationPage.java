package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class VehicleInformationPage extends BaseClass {

	public VehicleInformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Vehicle Information']")
	private WebElement successMsg;
	@FindBy(xpath = "//div[@id='BAVehiclePopup:VehicleScreen:BAVehicleCV:BAGarageLocationInputSet:BAGarageLocationInput-trigger-picker']")
	private WebElement garagedAtIcon;
	@FindBy(xpath = "//input[@id ='BAVehiclePopup:VehicleScreen:BAVehicleCV:BAGarageLocationInputSet:BAGarageLocationInput-inputEl']")
	private WebElement garagedAt;
	@FindBy(xpath = "//input[@id ='BAVehiclePopup:VehicleScreen:BAVehicleCV:VehicleDV:Type-inputEl']")
	private WebElement vehicleType;
	@FindBy(xpath = "//input[@id='BAVehiclePopup:VehicleScreen:BAVehicleCV:VehicleDV:Vin-inputEl']")
	private WebElement vin;
	@FindBy(xpath = "//li[text()='Arizona']")
	private WebElement license;
	@FindBy(xpath = "//input[@id='BAVehiclePopup:VehicleScreen:BAVehicleCV:VehicleDV:Cost-inputEl']")
	private WebElement cost;
	@FindBy(xpath = "//div[@id='BAVehiclePopup:VehicleScreen:BAVehicleCV:VehicleDV:ClassCode:SelectClassCode']")
	private WebElement search;
	@FindBy(xpath = "//span[@id ='BAVehiclePopup:VehicleScreen:Update-btnInnerEl']")
	private WebElement okBtn;
	
		
	public WebElement getSuccessMsg() {
		return successMsg;
	}

	
	public WebElement getGaragedAt() {
		return garagedAt;
	}

	public WebElement getVehicleType() {
		return vehicleType;
	}

	public WebElement getVIN() {
		return vin;
	}

	public WebElement getLicenseState() {
		return license;
	}

	public WebElement getCostNew() {
		return cost;
	}
	
	public WebElement getclick() {
		return search;
	}
	
	public WebElement getclickOkBtn() {
		return okBtn;
	}
	
	public WebElement getGaragedAtIcon() {
		return garagedAtIcon;
	}
	
	public void EntersMandatoryFields(String garagedAt, String vehicleType, String VIN, String licenseState, String costNew) {
		//WebElement garagedAtIcon =getGaragedAtIcon();
		//click(garagedAtIcon);
		WebElement garaged = getGaragedAt();
		sendKeys(garaged, garagedAt);
		//click(garaged);
		WebElement vehicle = getVehicleType();
		sendKeys(vehicle, vehicleType);
		WebElement VINNo = getVIN();
		sendKeys(VINNo, VIN);
		WebElement stateLicense = getLicenseState();
		click(stateLicense);
		WebElement newCost = getCostNew();
		sendKeys(newCost, costNew);
	}
	
	public void clickSearch() {
		WebElement nextBtn = getclick();
		click(nextBtn);
	}
	
	public void clickOkButn() {
		WebElement okBtn = getclickOkBtn();
		click(okBtn);
						
	}

	
	
}
