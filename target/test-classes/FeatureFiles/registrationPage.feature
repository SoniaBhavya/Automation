Feature: Create an account in Luma web application

  Scenario: User creates an account in luma with valid details
    Given User is on the luma web application
    And Click Create an Account on home page
    And User enters all the valid details
    When User submits the details
    Then User should be able to create an account in luma