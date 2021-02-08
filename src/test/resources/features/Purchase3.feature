Feature: Purchase3

  Background: common steps
    Given I am on the  homepage
    And I click sign in

  Scenario:I want to make an order
    Given I signed in
    And I select product to cart
    When I checked out
    And Order completed
    Then I should logout


