Feature: An Employee can manage Customer
  #All customers should show up on manage customers module populating the account information of the customer "First Name  Last Name  Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date "
  #"There should be a View option where customer can be navigated to all customer info and see
  #edit button there"
  #There should be an Edit button where all customer information can be populated
  #The Edit portal can allow user to create or update the user info
  #User can delete a customer, but seeing a message if the user is sure about deletion



  @US012
  Scenario:By logging into the website as "Employee", viewing account information and checking the function of buttons such as edit,delete
      #1.
    When Login to the system with employee account
    And  Click on  manage customers tab under the my operations tab
    And  Test that the customer has First Name  Last Name  Middle Initial  Email  Mobile Phone Number  Phone Number  Address  Create Date information
      #2.
    And  Test that there is a View" and "Edit buttons in the "Manage Customers" tab and test that there is an  button at the bottom after pressing this button
      #3.
    And Test that the Edit button appears at the bottom of the page that appears when I click the "View" button for any customer in the "Manage Customers" tab
      #4.
    And Test that the Create or edit a Customer title appears after clicking the "Edit" button inside the customer page
      #5.
    Then Again, on the Manage Customers page, test that the text that appears when the Delete button is pressed for any customer includes the message sure you want to delete



