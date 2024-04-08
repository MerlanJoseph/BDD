package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ModifiersPage extends BaseClass{

	public ModifiersPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//span[text()='Modifiers'])[2]")
	private WebElement successMsg;
	@FindBy(xpath = "//span[@id='SubmissionWizard:Next-btnInnerEl']")
	private WebElement btnNext;
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}
	public WebElement getbtnNext() {
		return btnNext;
	}
	
	public void ClickNextBtn() {
		WebElement nxtBtn =getbtnNext();
		click(nxtBtn);
	}
	
	
}
