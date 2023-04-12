Feature: Register new using API


  @US021
  Scenario: Create a new register with the help of the RestAssured class

    Given User creates data for a patient
    And User sends this patient created by post request.
    Then User verifies patient