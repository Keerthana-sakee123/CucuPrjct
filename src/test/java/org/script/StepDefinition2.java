package org.script;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass{
	@Given("user is on the amazon page")
	public void user_is_on_the_amazon_page() {
	    browserLaunch("Chrome");
	    maxWindow();
	    launchUrl("https://www.amazon.in/");
	    System.out.println("Given");
	}

	@When("User enters the product name on search bar")
	public void user_enters_the_product_name_on_search_bar() {
	   WebElement search = findingElement("xpath", "//input[@type='text']");
	   sendText(search, "iphones");
	   System.out.println("when");
	}

	@Then("User clicks the search button")
	public void user_clicks_the_search_button() {
	WebElement sbtn = findingElement("xpath", "//input[@type='submit']");
	btnClick(sbtn);
	System.out.println("then");
	}

}
