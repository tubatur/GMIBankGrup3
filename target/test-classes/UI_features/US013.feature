Feature: An Employee can create a new Account

  #User should create a description for the new account and it cannot be blank
  #User should provide a balance for the first time account creation as Dollar
  #User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING
  #Account status should be defined as ACTIVE, SUSPENDED or CLOSED
  #User can select an employee from the drop-down

  Background:
    Given User go to the "https://gmibank.com/" web page

  @US013
  Scenario:The user must perform the necessary steps to create a new account by opening the site with an "Employee" account

    When Login to the systemm with employee account
    And  Click on  manage accounts tab under the my operations tab
    And  Click on Create a new Account
    And  User should create a description for the new account and it cannot be blank
    And  User should provide a balance for the first time account creation as Dollar
    And  User can select an account type as CHECKING, SAVING, CREDIT_CARD or INVESTING and Account status should be defined as ACTIVE, SUSPENDED or CLOSED
    And  User can select an employee from the drop-down
    Then Save,Back and control to the Account list


