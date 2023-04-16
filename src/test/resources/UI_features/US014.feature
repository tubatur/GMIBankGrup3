
Feature: Record account creation date

  @US014

  Scenario: An account is made and the creation date is checked

    When Go to the account creation page
    And Required information is filled and the creation date is entered as an old date
    Then It is verified that your transaction did not occur because the date is outdated
