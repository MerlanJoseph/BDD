package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CACoveragesPage extends BaseClass {
	
	public CACoveragesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[text()='Covered Vehicles'])[2]")
	private WebElement successMsg;
	@FindBy(xpath = "//span[text()='Edit Covered Vehicles']")
	private WebElement editCoverCoverage;
	@FindBy(xpath = "(//img[@class ='x-grid-checkcolumn'])[4]")
	private WebElement ocv;
	@FindBy(xpath = "//span[@id='SubmissionWizard:Next-btnInnerEl']")
	private WebElement btnNext;
	
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement geteditCoverCoverage() {
		return editCoverCoverage;
	}
	public WebElement getocv() {
		return ocv;
	}
	public WebElement getbtnNext() {
		return btnNext;
	}
	
	public void CAeditCoverage() {
		WebElement editCA =geteditCoverCoverage();
		click(editCA);
		WebElement ocvSelect = getocv();
		click(ocvSelect);
		WebElement nextBtn =getbtnNext();
		click(nextBtn);
		
		
	}
	public void ClickNextBtn(){
		WebElement nextBtn =getbtnNext();
		click(nextBtn);
		
	}
	
	

}
