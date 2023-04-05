Feature: Login Page Accessible with Valid Credentials
  @DBtest
  Scenario: There should be a valid username and password validating the success message to login
    Given I am on the login page
    When I clicked the profile icon
    When I clicked the sign in button
    When I enter valid username and password
    When I click the Sign in button
    Then I should see the Admin Strator near the profile icon

  @DBtest
  Scenario: There should be an invalid username and password validating the fail message to login
    Given I am on the login page
    When I clicked the profile icon
    When I clicked the sign in button
    When I enter invalid username and password
    When I click the Sign in button
    Then I should see the fail message
