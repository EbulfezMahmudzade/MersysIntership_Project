Feature:Profile Theme Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario:
      Given User should be able to click profile setting button
      When User should be able to select profile theme
      Then User should be click save button and display success message