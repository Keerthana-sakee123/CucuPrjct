package org.sample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\Keerthi_Java\\CucuPrjt2\\src\\test\\resources\\Featurefiles\\Adactin1.feature",
		"D:\\Keerthi_Java\\CucuPrjt2\\src\\test\\resources\\Featurefiles\\AmazonPage.feature"},
		glue = "org.script")
public class TestRunner {

}
