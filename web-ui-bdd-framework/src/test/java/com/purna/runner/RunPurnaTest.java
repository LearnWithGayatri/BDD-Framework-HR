package com.purna.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "@TestHRLeaveApplication", 
		features = "src/test/resources/features", 
		glue = "com.purna.stepdefinitions",
		//dryRun=true,
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class RunPurnaTest extends AbstractTestNGCucumberTests {

}
	