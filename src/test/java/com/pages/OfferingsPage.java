package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class OfferingsPage extends BaseClass {

	public OfferingsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@id='SubmissionWizard:OfferingScreen:ttlBar']")
	private WebElement successMsg;
	@FindBy(xpath = "//div[@id='SubmissionWizard:OfferingScreen:OfferingSelection-trigger-picker']")
	private WebElement osDDIcon;
	@FindBy(xpath = "//li[text()='Basic Program']")
	private WebElement offeringBP;
	@FindBy(xpath = "//span[text()='Next >']")
	private WebElement btnNext;
	@FindBy(xpath ="//li[text()='Standard']")
	private WebElement offeringSP;
	

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getOsDDIcon() {
		return osDDIcon;
	}

	public WebElement getOfferingBP() {
		return offeringBP;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}
	
	public WebElement getofferingSP() {
		return offeringSP;
	}
	
	public void selectOffering() {
		WebElement DDIconOS = getOsDDIcon();
		click(DDIconOS);
		WebElement BPOffering = getOfferingBP();
		click(BPOffering);
		WebElement nextBtn = getBtnNext();
		clickByJS(nextBtn);
	}
	
	public void selectstdOffering() throws InterruptedException {
		unconditionalWait(2000);
		WebElement DDIconOS = getOsDDIcon();
		click(DDIconOS);
		WebElement BPOffering = getofferingSP();
		click(BPOffering);
		WebElement nextBtn = getBtnNext();
		clickByJS(nextBtn);
	}
	
}
