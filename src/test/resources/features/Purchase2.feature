Feature: Purchase2

  Scenario: I want to create a purchase

   // Given I am logged in successfully on the main page
    And I select a product
    And I change the quantity
    And I change the size
    And add it to the cart
    Then I click on proceed to checkout on dialogue
    Then continue checkout process on shopping cart summary page
    Then continue checkout on address page
    And  agree to terms of service
    Then click of proceed to checkout on shipping page
    Then click on pay by bank wire
    When I click on confirm my order on order summary page
    Then my order should be completed successfully




