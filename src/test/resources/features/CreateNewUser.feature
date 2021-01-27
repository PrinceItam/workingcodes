@ignore
Feature: Create new user

  Background: common steps
    Given  I am on the  homepage
    And I click sign in

  Scenario: I want to create new user
   
    And I enter email address for new user
    And I click on the create account button
    And I enter all necessary details
    When I click on the register button
    Then My account should be registered correctly



