Feature: log in to luma application

  Scenario: login to luma with valid credentials
    Given Navigate to the  login page
    And User enters email and password
    When User clicks  sign in button
    Then User should be able to navigate to login page




