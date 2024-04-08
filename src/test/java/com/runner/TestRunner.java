package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@two", dryRun = false, monochrome = true, stepNotifications = true, publish = true, features = {
		"src\\test\\resources" }, glue = { "com.stepdefinition" }, plugin = { "pretty", "json:target\\report.json" })

public class TestRunner extends BaseClass {

	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJVMReport(getProjectPath() + getPropertyFileValue("jsonPath"));
	}
}