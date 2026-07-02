package com.orange.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\feature\\Login.feature",
		glue = "com.orange.stepDefinition",
		plugin = {"pretty",
				"html: target\\login-report.html" },
		monochrome = true
		
		)
public class TestRunner {

}
