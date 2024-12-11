package org.script;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass{

	@Given("User is on chrome browser")
	public void user_is_on_chrome_browser() {
		browserLaunch("Chrome");
		maxWindow();
	}

	@When("User launch the adactin login page")
	public void user_launch_the_adactin_login_page() {
		launchUrl("https://adactinhotelapp.com/");
	}

	@Given("User confirms the login page is opened")
	public void user_confirms_the_login_page_is_opened() {
		String title="Adactin.com - Hotel Reservation System";
		String urlTitle = urlTitle();
	   boolean equals = title.equals(urlTitle);
	   if(equals==true) {
		   System.out.println("Login page verified");
	   }else
	   {
		   System.out.println("Invalid page");
		   //System.exit(0);
	    }
	}

	@When("User enters valid login credentials")
	public void user_enters_valid_login_credentials() {
	   WebElement user = findingElement("id", "username");
	   sendText(user, "saralama");
	   WebElement pass = findingElement("id", "password");
	   sendText(pass, "4K3535");
	}

	@Then("User clicks on login button")
	public void user_clicks_on_login_button() {
	   WebElement log = findingElement("id", "login");
	   btnClick(log);
	}

	@Given("User clicks the forgotten password")
	public void user_clicks_the_forgotten_password() {
	    WebElement forgot = findingElement("xpath", "//a[text()='Forgot Password?']" );
	    btnClick(forgot);
	}

	@When("User enters valid email")
	public void user_enters_valid_email() {
		WebElement em = findingElement("id", "emailadd_recovery");
		sendText(em, "rit2145@eoilup.com");
		
	}

	@Then("User clicks the email password button")
	public void user_clicks_the_email_password_button() {
	    WebElement ebtn = findingElement("xpath", "//input[@type='submit']");
	    btnClick(ebtn);
	}

	@Given("User clicks the new user registration")
	public void user_clicks_the_new_user_registration() {
	    WebElement reg = findingElement("xpath", "//a[text()='New User Register Here']");
	    btnClick(reg);
	}

	@When("User fills the form enters valid login credentials")
	public void user_fills_the_form_enters_valid_login_credentials() {
	   WebElement usr = findingElement("id", "username");
	   sendText(usr, "ramu123");
	}

	@Then("User clicks the register button")
	public void user_clicks_the_register_button() {
	    WebElement regis = findingElement("id", "Submit");
	    btnClick(regis);
	}



	
	
}
