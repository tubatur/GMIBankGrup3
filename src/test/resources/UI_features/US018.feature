Feature: An User can manage Customer



  @US_018
  Scenario:By logging into the website as "User", viewing account information and checking the function of buttons such as edit,delete
      #1.
    When Login to the system with user account

    And  Clickk on  manage customers tab under the my operations tab

    And  Testt that the customer has First Name  Last Name  Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date information
      #2.
    And  Testt that there is a View and Edit buttons in the Manage Customers tab and test that there is an  button at the bottom after pressing this button
      #3.
    And Testt that the Edit button appears at the bottom of the page that appears when I click the View button for any customer in the Manage Customers tab
      #4.
    And Testt that the Create or edit a Customer title appears after clicking the Edit button inside the customer page
      #5.
    Then Againn, on the Manage Customers page, test that the text that appears when the Delete button is pressed for any customer includes the message sure you want to delete
