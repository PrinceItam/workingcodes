Feature: Purchase

  Background: common steps
    Given  I am on the  homepage
    And I click sign in


  Scenario: I want to create new purchase

    And I enter valid login credentials
    And I made an order
    When I click checkout
    Then I am able to complete my order successfully