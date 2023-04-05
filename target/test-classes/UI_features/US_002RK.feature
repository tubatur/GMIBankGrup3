Feature: Registration with invalid information

  Scenario: Registration is not possible with information in inappropriate formats and fields left blank.

    Given User goes to "https:www.gmibank.com"
    And User goes to  Register page
    When The user fills in the boxes on the page incompletely or in an incorrect format.
    And User clicks the register button
    Then The system sees a message that the registration cannot be completed due to incorrect or missing information.



