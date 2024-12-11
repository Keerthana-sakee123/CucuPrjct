Feature: validate the facebook login page
Scenario: Validation of FB page
Given User is on the facebook
When User enters invalid username and password
And user clicks on login button
Then User validates the error message after login