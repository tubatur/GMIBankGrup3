Feature: User settings should be editable on HomePage

  Background:
    Given User goes to "https://www.gmibank.com/" page
    @US006
    Scenario:
    When There should be user info being populated when navigating to user info "firstname, lastname email and language"
    And  There should be 2 languages available "English and Turkish"
    And  There should be an option to update firstname
    And  There should be an option to update lastname
    Then There should be an option to update email id adding "@" sign and "." extension
