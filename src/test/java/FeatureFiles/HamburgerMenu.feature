Feature: Hamburger Menu Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario:
      Given Hamburger Menu button should be clickable
      When User should see messaging tab
      Then User should be able to hover over the messages tab