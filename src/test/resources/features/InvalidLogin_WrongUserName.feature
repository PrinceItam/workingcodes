Feature: Login

 Background: common steps
  Given  I am on the  homepage
  And I click sign in

  Scenario Outline: login with incorrect credentials should return correct error message

   
    And I enter wrong "<email>"
    And I enter correct "<password>"
    When I select login button
    Then i should get an "<ErrorMessage>"

    Examples:

    |email                      |password          |ErrorMessage                |
    |                           |automation        |An email address required.  |
    |lanre.ikuesan2@gmail.com   |                  |Password is required.       |
    |lanre.ikuesan647@gmail.com |automation        |Authentication failed.      |
    |lanre.ikuesan2@gmail.com   |autocratic        |Authentication failed.      |
    |                           |                  |An email address required.  |