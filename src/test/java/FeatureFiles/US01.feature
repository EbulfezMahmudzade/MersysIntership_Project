Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to Campus Website
    When The users types username and password and click login button
    Then The users verifies login successfully

  Scenario: Login with valid username and password negative

    Given Navigate to Campus Website
    When Enter username and password and click login button negative
    Then is fail