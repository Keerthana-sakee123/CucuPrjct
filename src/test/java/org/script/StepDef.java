package org.script;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDef extends BaseClass{

@Given("User is on the facebook")
public void user_is_on_the_facebook() {
  
	browserLaunch("Chrome");
	maxWindow();
	launchUrl("https://www.facebook.com/");
}

@When("User enters invalid username and password")
public void user_enters_invalid_username_and_password() {
   WebElement username = findingElement("id", "email");
   sendText(username, "keerthanaangusamy@gmaail.com");
   WebElement password = findingElement("name", "pass");
   sendText(password, "hifriend");
}

@And("user clicks on login button")
public void user_clicks_on_login_button() {
   WebElement log = findingElement("name", "login");
   btnClick(log);
}

@Then("User validates the error message after login")
public void user_validates_the_error_message_after_login() {
    System.out.println("Error msg");
}



}
