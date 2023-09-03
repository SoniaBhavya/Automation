Feature: log in to luma application

  Scenario: login to luma with valid credentials
    Given Navigate to  login page
    And User enter email and password
    When User click  sign in button
    Then User should be able to navigate login page




