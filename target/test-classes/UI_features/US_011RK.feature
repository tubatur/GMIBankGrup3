Feature: The date must have been created when the customer was created

  Scenario: Make sure the correct date is selected when the customer is created financial

    Given User has an account
    And Zelle Enrolled option can be selected optionally
    When Customer information is entered
    Then The creation date is correctly created
    And Customer information has been correctly recorded