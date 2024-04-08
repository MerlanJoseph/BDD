package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PACoveragesPage extends BaseClass {

	public PACoveragesPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//span[@id='SubmissionWizard:Next-btnInnerEl']")
	private WebElement btnNext;

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

}
