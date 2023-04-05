Feature: Password segment on Homepage should be editable

  Background:
    Given User goes to "https://www.gmibank.com/" page
  @US008
  Scenario:
    When The old password should not be used
    And There should be at least 1 lowercase char for stronger password and see the level chart change accordingly
    And There should be at least 1 uppercase char and see the level  chart change accordingly
    And There should be at least 1 digit  and see the level  chart change accordingly
    And There should be at least 1 special char and see the level bar change accordingly
    And There should be at least 1 special char and see the level bar change accordingly
    Then The new passwoerd should be confirmed