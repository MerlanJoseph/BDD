package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LOBPage extends BaseClass {

	public LOBPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[text()='Personal Auto'])[1]")
	private WebElement successMsg;
	@FindBy(xpath = "(//a[text()='Select'])[8]")
	private WebElement btnSelectPA;
	@FindBy(xpath = "(//div[text()='Commercial Auto'])[1]")
	private WebElement commericalsuccessMsg;
	@FindBy(xpath = "(//a[text()='Select'])[2]")
	private WebElement btnSelectCA;

	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getBtnSelectPA() {
		return btnSelectPA;
	}
		
		public WebElement getBtnSelectCA() {
			return btnSelectCA;
		
		
	}
	public WebElement getCASuccessMsg() {
		return commericalsuccessMsg;
	}

	public void selectPALOB() {
		WebElement selectBtn = getBtnSelectPA();
		click(selectBtn);
	}
	public void selectCALOB() {
		WebElement commericalselectBtn = getBtnSelectCA();
		click(commericalselectBtn);
	}
	
	

}
