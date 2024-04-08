package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='Login:LoginScreen:LoginDV:username-inputEl']")
	private WebElement txtBoxUsername;
	@FindBy(xpath = "//input[@id='Login:LoginScreen:LoginDV:password-inputEl']")
	private WebElement txtBoxPassword;
	@FindBy(xpath = "//span[text()='Log In']")
	private WebElement btnLogin;

	public WebElement getTxtBoxUsername() {
		return txtBoxUsername;
	}

	public WebElement getTxtBoxPassword() {
		return txtBoxPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void login() throws FileNotFoundException, IOException {
		WebElement usernameTxtBox = getTxtBoxUsername();
		sendKeys(usernameTxtBox, getPropertyFileValue("username"));
		WebElement passwordTxtBox = getTxtBoxPassword();
		sendKeys(passwordTxtBox, getPropertyFileValue("password"));
		WebElement loginBtn = getBtnLogin();
		click(loginBtn);
	}
}
