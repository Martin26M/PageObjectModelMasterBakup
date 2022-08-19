package com.crm.qa.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporting {
	
	
	public void  reporting() {
	ExtentSparkReporter reporter  = new ExtentSparkReporter("./Reports/index.html");
	reporter.config().setDocumentTitle("Automation");
	ExtentReports extent = new ExtentReports();
	
	extent.attachReporter(reporter);
	
	
	
	}
	
	
	
	
}