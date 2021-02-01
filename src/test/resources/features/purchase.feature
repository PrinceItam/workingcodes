Feature: Purchase

  Background: Common steps
    Given  I am on the  homepage
    And I click sign in

  Scenario: I want to make an order

  Given I am logged in
  And I add product to cart
  When I check out
  Then Order should be complete