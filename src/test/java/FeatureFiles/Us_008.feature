Feature: Hamburger Menu Messaging Functionality

  Background:
    Given Navigate to Mersys
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Finance Page
      Given Going to more from the hamburger menu
      When Click on the finance section from the menu
      Then Access the finance page