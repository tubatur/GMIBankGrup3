Feature: All state
  Scenario: All states
    Given I get bearer token with "batch_yuzuc" and "Batch.103"
    When I call GET c-states
    Then The status code should be "200"