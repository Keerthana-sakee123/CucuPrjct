package org.sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Keerthi_Java\\CucuPrjt\\src\\test\\resources\\FbLogin.feature",
				glue = "org.script")
public class TestRunner {

}
