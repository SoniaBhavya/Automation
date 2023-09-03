Feature: Checkout
  Scenario: Checkout the Product
    Given Product is selcted and add to cart
    When User fills the shipping address
    And User makes Payment
    Then User should be able to checkout Product
