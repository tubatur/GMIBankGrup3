Feature: User manages their own account

  Background:
    Given User goes to "https://gmibank.com/" web page.

    @US015
    Scenario: User should be able to manage their own account
      When User clicks the profile icon
      And User clicks the sign in button
      And User enters "user2023" User username as username
      And User enters "User.Name23" User password as password
      And User clicks the SignIn 2 button
      And User sees user menu and is verified to be in the user account
      And User clicks My Operations menu
      And User clicks Manage Accounts menu
      And User verifies that he sees Balance as table header
      And User verifies that he sees Account Type as table header
      And User clicks View button
      And User confirms to see the heading Account