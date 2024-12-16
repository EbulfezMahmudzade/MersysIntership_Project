Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click login button


  Scenario: Login with valid username and password negative

    Given Navigate to Campus
    When Enter username and password and click login button negative
    Then is fail