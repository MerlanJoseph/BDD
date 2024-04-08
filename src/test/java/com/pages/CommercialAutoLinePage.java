package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class CommercialAutoLinePage extends BaseClass {

	public CommercialAutoLinePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//span[text() ='Commercial Auto Line'])[2]")
	private WebElement successMsg;
	@FindBy(xpath = "//div[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BALineScreen:BALinePanelSet:BALineCoveragePanelSet:BALineDV:PolicyType-trigger-picker']")
	private WebElement productIcon;
	@FindBy(xpath = "//DIV[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BALineScreen:BALinePanelSet:BALineCoveragePanelSet:BALineDV:Fleet-trigger-picker']")
	private WebElement fleetIcon;
	@FindBy(xpath = "//li[text() ='Fewer than 10 units']")
	private WebElement fleetOption;
	@FindBy(xpath = "//li[text() ='Motor Carrier and Truckers']")
	private WebElement productOption;
	@FindBy(xpath = "//span[text()='Next >']")
	private WebElement btnNext;
	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement hiredLiabilityBtn;
	@FindBy(xpath ="//li[text() ='250K CSL']")
	private WebElement liabilityBI;
	@FindBy(xpath = "//div[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BALineScreen:BALinePanelSet:BALineCoveragePanelSet:BAPHiredGrpIterator:0:BAHiredGroupInputSet:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-trigger-picker']")
	private WebElement liabilityIcon;
	@FindBy(xpath = "//li[text()='Arizona']")
	private WebElement stateSelection;
	@FindBy(xpath = "//div[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BALineScreen:BALinePanelSet:BALineCoveragePanelSet:SelectStateHiredAuto-trigger-picker']")
	private WebElement stateSelectionIcon;
	@FindBy(xpath = "//span[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BALineScreen:BALinePanelSet:BALineCoveragePanelSet:Add-btnInnerEl']")
	private WebElement addstateBtn;
	@FindBy(xpath = "(//div[@class='x-grid-cell-inner '])[2]")
	private WebElement costOfHire;
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement stLiabilityIcon;
	@FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BALineScreen:BALinePanelSet:BALineCoveragePanelSet:baLineLiabCatIterator:0:BALiabGroupInputSet:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']")
	private WebElement limit;
	@FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BALineScreen:BALinePanelSet:BALineCoveragePanelSet:baLineLiabCatIterator:0:BALiabGroupInputSet:CoverageInputSet:CovPatternInputGroup:1:CovTermInputSet:DateTimeTermInput-inputEl']")
	private WebElement startcoverage;
	@FindBy(xpath = "//input[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:BALineScreen:BALinePanelSet:BALineCoveragePanelSet:baLineLiabCatIterator:0:BALiabGroupInputSet:CoverageInputSet:CovPatternInputGroup:2:CovTermInputSet:DateTimeTermInput-inputEl']")
	private WebElement endcoverage;
	
	
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}
	public WebElement getProductIcon() {
		return productIcon;
	}
	public WebElement getFleetIcon() {
		return fleetIcon;
	}
	public WebElement getProduct() {
		return productOption;
	}
	
	public WebElement getFleet() {
		return fleetOption;
	}
	public WebElement getBtnNext() {
		return btnNext;
	}
	public WebElement getHiredLiabilityBtn() {
		return hiredLiabilityBtn;
	}
	public WebElement getLiabilityBI() {
		return liabilityBI;
	}
	public WebElement getLiabilityIcon() {
		return liabilityIcon;
	}
	public WebElement getStateSelection() {
		return stateSelection;
	}
	public WebElement getStateSelectionIcon() {
		return stateSelectionIcon;
	}
	public WebElement getAddstateBtn() {
		return addstateBtn;
	}
	public WebElement getCostOfHire() {
		return costOfHire;
	}
	public WebElement getStLiabilityIcon() {
		return stLiabilityIcon;
	}
	
    public WebElement getLimit() {
	    return limit;
    }
    public WebElement getStartcoverage() {
	    return startcoverage;
    }
    public WebElement getEndcoverage() {
	    return endcoverage;
    }
		
	
	public void selectProductAndfleetAndliability(String Product, String Fleet ) throws InterruptedException {
		WebElement prodIcon = getProductIcon();
		click(prodIcon);
		WebElement prod = getProduct();
		click(prod);
		unconditionalWait(2000);
		WebElement fleetIcon = getFleetIcon();
		click(fleetIcon);
		WebElement fleets = getFleet();
		click(fleets);
		unconditionalWait(2000);
		WebElement stLiability =getStLiabilityIcon();
		click(stLiability);
		unconditionalWait(2000);
		WebElement limits =getLimit();
		limits.sendKeys("100");
		WebElement startcoverage  =getStartcoverage();
		startcoverage.sendKeys("01/18/2024");
		WebElement endcoverage =getEndcoverage();
		endcoverage.sendKeys("01/18/2025");
		WebElement nextBtn = getBtnNext();
		clickByJS(nextBtn);
				
	}
	
	

}

