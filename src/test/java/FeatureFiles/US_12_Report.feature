Feature: Finance Report

  Background:
    Given Navigate to Campus Website
    When The users types username and password and click login button
    Then The users verifies login successfully

  Scenario: Accessing and downloading finance reports

    Given The user clicks on the hamburger menu
    When  The user navigates to Finance and then to My Finance
    Then  The user should access the finance page
    When  The user clicks on the Overflow menu for report types
    And   The user selects a report format
    Then  The user should be successfully downloaded to the local drive