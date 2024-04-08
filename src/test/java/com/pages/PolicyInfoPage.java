package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PolicyInfoPage extends BaseClass {

	public PolicyInfoPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//span[@id='SubmissionWizard:Next-btnInnerEl']")
	private WebElement btnNext;
	@FindBy(xpath = "//li[text()='Common ownership']")
    private WebElement orgtype;
	@FindBy(xpath = "//div[@id=\"SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OrganizationType-trigger-picker\"]")
    private WebElement orgIcon;
	
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}
	
	public void clickNext() {
		WebElement nextBtn = getBtnNext();
		click(nextBtn);
	}
	public WebElement getOrgtype() {
		return orgtype;
		}
	public WebElement getOrgIcon() {
		return  orgIcon;
	}
	public void enterMandatoryFieldsForOrganization() throws InterruptedException
	{
		WebElement ICON = getOrgIcon();
		click(ICON);
		unconditionalWait(3000);
		WebElement orgType = getOrgtype();
		click(orgType);
		
}
	
}
