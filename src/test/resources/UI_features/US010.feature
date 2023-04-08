Feature: Creation of customer's address

  Background:
    Given User goes to "https://gmibank.com/" web page


  @US010
  Scenario: User should be able to create the customer address according to the requirements.
    When User clicks the profile icon
    And User clicks the sign in button
    And User enters "manager2023" Manager username as username
    And User enters "Mana.Ger23" Manager password as password
    And User clicks the SignIn 2 button
    And User clicks My Operations menu
    And User clicks Manage Customers menu
    And User clicks Edit button
    And User scrolls mouse down
    And User clicks on address
    And Address as street and number should be provided
    And User clicks on city
    And City should be provided
    And User clicks on Country
    And Country should be typed
    And User clicks on State
    And State should be provided as US state





