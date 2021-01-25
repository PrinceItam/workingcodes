@ignore
Feature: Login

  Background: common steps
    Given  I am on the  homepage
    And I click sign in

  Scenario: I want to login with valid credentials

    #Given I am on the landing page
   # And I choose signin link
    When I enter my username
    And I enter my password
    Then I should be logged in successfully

