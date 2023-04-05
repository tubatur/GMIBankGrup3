
Feature: Invalid and incomplete user information's should not be registered to the system.


  Background:

    Given User goes to "https://gmibank.com/"  homepage


  @US002
  Scenario: When invalid and incomplete user information is entered, the system should not register and give an error message.

    When By clicking on the register option on the home screen and entering the necessary information
    And  After the information is entered, the Register button is clicked.
    Then the error message is confirmed due to inappropriately formatted information or blank space remaining.