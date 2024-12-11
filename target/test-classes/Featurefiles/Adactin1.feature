Feature: Testing the adactin login page with valid data

  Background: To launch the webpage
    Given User is on chrome browser
    When User launch the adactin login page

  Scenario: Test the login page
    Given User confirms the login page is opened
    When User enters valid login credentials
    Then User clicks on login button

  Scenario: Test the forgotten password page
    Given User clicks the forgotten password
    When User enters valid email
    Then User clicks the email password button

  Scenario: Test the new user registration page
    Given User clicks the new user registration
    When User fills the form enters valid login credentials
    Then User clicks the register button
