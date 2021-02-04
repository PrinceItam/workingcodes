Feature: Purchase items in the store


  Scenario: I want to buy items in the webpage
    Given I am on the homepage
    When I place an order
    Then I should see my order history and reference
