package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.*;

public class HooksClass extends BaseClass {

	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browserName"));
		launchURL(getPropertyFileValue("URL"));
		maximizeWindow();
	}

	@After
	public void afterScenario(Scenario scenario) {
		scenario.attach(cucumberScreenshot(), "images/png", "Every Scenario");
//		driver.quit();
	}

}