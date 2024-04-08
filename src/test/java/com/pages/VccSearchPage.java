package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
public class VccSearchPage extends BaseClass {
	
	public VccSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text() ='Vehicle Class Code Search']")
	private WebElement successMsg;
	@FindBy(xpath = "//li[text()='Light truck']")
	private WebElement sizeClass;
	@FindBy(xpath = "//a[@id='VehicleClassCodeSearchPopup:VehicleClassCodeSearchScreen:VehicleClassCodeSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
	private WebElement searchBtn;
	@FindBy(xpath = "//a[@id ='VehicleClassCodeSearchPopup:VehicleClassCodeSearchScreen:VehicleClassCodeSearchResultsLV:0:_Select']")
	private WebElement selectBtn;
	
	public WebElement getSuccessMsg() {
		return successMsg;
	}

	public WebElement getSizeClass() {
		return sizeClass;
	}
	
	public WebElement clickBtn() {
		return searchBtn;
	}
	
	public WebElement clickSelectBtn() {
		return selectBtn;
	}
	
	
	public void vccSearch(String size) {
		WebElement sizeClass = getSizeClass();
		sendKeys(sizeClass, size);
		WebElement searchBtn = clickBtn();
		click(searchBtn);
		WebElement select = clickSelectBtn();
		click(select);
		}
	

}
