package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.base.BaseClass;

public class DriverDetailsPage extends BaseClass {

	public DriverDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text() ='Driver Details']")
	private WebElement successMsg;
	@FindBy(xpath = "(//span[text() ='OK'])[1]")
	private WebElement okBtn;
	@FindBy(xpath = "//input[@id ='BADriverPopup:BADriverScreen:BADriversDV:GlobalPersonNameInputSet:FirstName-inputEl']")
	private WebElement fName;
	@FindBy(xpath = "//input[@id ='BADriverPopup:BADriverScreen:BADriversDV:GlobalPersonNameInputSet:LastName-inputEl']")
	private WebElement lName;
	@FindBy(xpath = "//input[@id ='BADriverPopup:BADriverScreen:BADriversDV:Gender-inputEl']")
	private WebElement gender;
	@FindBy(xpath = "//input[@id ='BADriverPopup:BADriverScreen:BADriversDV:DateOfBirth-inputEl']")
	private WebElement dob;
	@FindBy(xpath = "//input[@id ='BADriverPopup:BADriverScreen:BADriversDV:LicenseNumber-inputEl']")
	private WebElement licenseNo;
	@FindBy(xpath = "//div[@id='BADriverPopup:BADriverScreen:BADriversDV:LicenseState-trigger-picker']")
	private WebElement lsDDIcon;
	@FindBy(xpath = "//li[text()='Arizona']")
	private WebElement licenseState;
	@FindBy(xpath = "//input[@id='BADriverPopup:BADriverScreen:BADriversDV:YearLicensed-inputEl']")
	private WebElement licesenceYear;
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}
	
	public WebElement clickOkBtn() {
		return okBtn;
    }
	public WebElement getFName() {
		return fName;
    }
	public WebElement getLName() {
		return lName;
    }
	public WebElement getGender() {
		return gender;
    }
	public WebElement getDOB() {
		return dob;
    }
	public WebElement getLicenseNo() {
		return licenseNo;
    }
	
	
	public WebElement getLicesenceYear() {
		return licesenceYear;
	}
	public WebElement getLsDDIcon() {
		return lsDDIcon;
	}

	public WebElement getLicenseState() {
		return licenseState;
	}
	
	public void mandatoryDetails(String fname,String lname,String gender,String DOB, String licenseNo, String licenseState, String licenseyear) throws InterruptedException {
		unconditionalWait(2000);
		WebElement firstName =getFName();
		sendKeys(firstName, fname);
		WebElement lastName = getLName();
		sendKeys(lastName, lname);
		WebElement genderType = getGender();
		genderType.clear();
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
        click(stateLicense);; 
  	    WebElement year = getLicesenceYear();
  	    sendKeys(year, licenseyear);
  	    WebElement Btn = clickOkBtn();
  	    clickByJS(Btn);
	}
	
	
	
	
}
