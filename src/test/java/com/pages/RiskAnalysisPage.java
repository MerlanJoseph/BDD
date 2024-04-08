package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RiskAnalysisPage extends BaseClass {

	public RiskAnalysisPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Risk Analysis'])[2]")
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
