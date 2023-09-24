Feature: Add to cart

  Scenario: Verify user adds a product in cart
    Given User is on home page
    When Click on any required image
    And verify user is redirected to the new tab
    And User Select colour black in  Shopping options
    And User selects list view
    And User Sort by with Product Name
    And User navigates to last page and select one product
    And User click on Add to cart
    Then User should be able to add product in cart
    #Test sonia