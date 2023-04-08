Feature: Date should be created at the time of customer creation

  @US011

  Background:
    Given Goes to Page
    And the user is on the customer registration page

  Scenario: Date should be created correctly when a customer is created and the account is approved by an admin
    Then the user clicks on the manage costumers tab in the my operations tab
    And Save button should be visible on the screen

  Scenario: only date should not be accepted without time information
    When The user enters the required information in an inappropriate date format
    And It is verified that the save button is active because the date format is not suitable

  Scenario: The user continues without making a choice from the Account menu.
    When The user does not make a selection from the Account menu and clicks the save button
    And The save button remains active as the recording will not take place

  Scenario: Checking the Zelle Enrolled box should be optional, and it should be possible to record when unchecked
    When the user continues without ticking the Zelle Enrolled box
    And  The save process takes place and it is verified that the save button is inactive
