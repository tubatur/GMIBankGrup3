Feature: User can search for a new applicant by their SSN and see all their registration info populated

  Background:
    Given User goes to "https://www.gmibank.com/" page

    @US009
    Scenario:
      When  go to website
      And   you should navigate to sign in page
      And   Provide the SNN of the applicant and submit
      Then  I should see the all registration info populated