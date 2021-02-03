Feature: Purchase2

 Background: common steps
  Given  I am on the  homepage
  And I click sign in

  Scenario: I want to create a purchase

    Given I add product to cart
    Then I click on proceed to checkout on pop up dialogue
    Then continue checkout process on shopping cart summary page
    Then continue checkout on address page
    And  agree to terms of service
    Then click on proceed to checkout on shipping page
    Then click on pay by bank wire
    When I click on I confirm my order on order summary page
    Then my order should be completed successfully




