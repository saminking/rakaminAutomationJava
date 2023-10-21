Feature: Order Page

  Background:
    Given user in login page
    When user input user name 'standard_user'
    And user input password 'secret_sauce'
    And user click login button
    Then user directed to product menu

  Scenario: As a user i want to order a product
    Given user in products page
    When user add to cart product number one
    Then user cart amount is increased to '1'
    Given user in cart page
    When user click check out button
    Then user directed to checkout page
    Given user in checkout page
    When user input first name 'Bella'
    And user input last name 'Sentosa'
    And user input zip code '1234'
    When user click continue button
    Then user directed to overview page
    Given user in overview page
    When user click finish
    Then user directed to thank you page

  Scenario: As a user i want to log out
    Given user in products page
    When user click hamburger menu
    And user click logout button
    Then user logout
