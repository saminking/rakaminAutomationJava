Feature: Login Page

  Scenario Outline: As a user i want to login using valid credential
    Given user in login page
    When user input user name '<userName>'
    And user input password '<password>'
    And user click login button
    Then user directed to product menu

    Examples:
    |userName|password|
    |standard_user|secret_sauce|

  Scenario Outline: As a user i want to login using locked username
    Given user in login page
    When user input user name '<userName>'
    And user input password '<password>'
    And user click login button
    Then error message shown

    Examples:
      |userName|password|
      |standard_user|secret_sauce|
