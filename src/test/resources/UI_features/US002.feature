@User

Feature: Invalid and incomplete user information's should not be registered to the system.


  Background:

    Given User goes to "https://gmibank.com/"  homepage



  @US002
  Scenario: When invalid email is entered, the system should not register and give an error message.
    When Entering the necessary information
    Then The error message - email is confirmed due to inappropriately formatted information or blank space remaining.
    And  After the information is entered, the RegisterSubmit button is clicked.


  Scenario: When invalid SSN is entered, the system should not register and give an error message.
    When  The page is refreshed and registration with the invalid SSN is performed
    And The error message is confirmed due to inappropriately formatted information or blank space remaining
    And  After the information is entered, the RegisterSubmit button is clicked


  Scenario: When invalid password is entered, the system should not register and give an error message.
    When If a password with an inappropriate format is entered during the registration process
    And Confirms the error message on the screen that the wrong password was entered
    And  After the information is entered, the RegisterSubmit button is clicked

  Scenario:  When no information is entered and left blank
    When First name box is left blank and other fields are filled
    And A warning message appears indicating that the required field is empty.
    And  After the information is entered, the RegisterSubmit button is clicked





