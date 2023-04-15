Feature: Money transfer should be available
@US016
  Scenario: User transfers money between accounts

    When The user fills in the required fields for money transfer
    And The user does not see an error message on the screen after the transfer takes place


