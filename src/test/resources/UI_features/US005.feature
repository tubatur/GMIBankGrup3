Feature: Login page should not be accessible with invalid credentials

  #User cannot login with invalid username validating the error message
  #User cannot login with invalid password validating the error message
  #User cannot login with invalid username and password validating the error message
  #User with invalid credentials should be given an option to reset their password
  #User should be given the option to navigate to registration page if they did not register yet

  Background:
    Given User goes to "https://gmibank.com/" web page
  @US005
  Scenario: User try to open page with dont suitable information and page should offer some posibilties

    When User cannot login with invalid username validating the error message
    And User cannot login with invalid password validating the error message
    And User cannot login with invalid username and password validating the error message
    And User with invalid credentials should be given an option to reset their password
    Then User should be given the option to navigate to registration page if they did not register yet
