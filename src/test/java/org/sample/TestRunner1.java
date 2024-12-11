package org.sample;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Keerthi_Java\\CucuPrjt2\\src\\test\\resources\\Featurefiles\\FbLogin.feature",
				glue = "org.script",dryRun=false,plugin="pretty", monochrome=false)
public class TestRunner1 {

}
