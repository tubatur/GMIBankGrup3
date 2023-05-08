Feature: Creating account and Updating countries using api

  @US026
  Scenario: User creates registered account
    Given User creates data for the registration
    And User sends a post request for registration
    Then User verifies API registration

  @US026
  Scenario: User should be able to update the countries using the api
    Given User gets country data
    When User updates country data
    Then User gets new country data


