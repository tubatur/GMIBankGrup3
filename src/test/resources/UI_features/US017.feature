Feature: User logs into the site as an administrator and manages all users(admin, manager,employee and user)

  @US017
   Scenario: As an administrator, user should be able to manage all users
    Given User goes to the home page
    When User clicks the profile icon
    And User clicks the sign in button
    And User enters "admin2023" Administrator username as username
    And User enters "Admin.Strator23" Administrator password as password
    And User clicks the SignIn 2 button
    And User clicks the Administration menu
   And User clicks User management menu
   And User verifies Deactivated for ROLE_USER profile
   And User verifies Deactivated for ROLE_EMPLOYEE profile
   And User verifies Deactivated for ROLE_MANAGER profile
   And User verifies Deactivated for ROLE_ADMIN profile
   And User clicks View button for ROLE_ADMIN profile
   And User verifies the output text
   And User clicks the Back button
   And User clicks Edit button for ROLE_MANAGER profile
   And User verifies the output text.
   And User clicks the Back button
   And User clicks Delete button for ROLE_EMPLOYEE profile
   And User verifies the output text..
   Then User confirms that they can click the delete key

