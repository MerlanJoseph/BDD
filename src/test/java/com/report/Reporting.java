package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass {
	
	public static void generateJVMReport(String jsonFile) throws FileNotFoundException, IOException {
		File file = new File(getProjectPath() + getPropertyFileValue("jvmPath"));
		Configuration config = new Configuration(file, "GW-Cucumber");
		config.addClassifications("FirstName", "SAral");
		config.addClassifications("LastName", "Kumar");
		config.addClassifications("Testing", "GuideWire");
		config.addClassifications("Browser", "Chrome");
		List<String> json = new ArrayList<String>();
		json.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(json, config);
		builder.generateReports();
	}
	
}
