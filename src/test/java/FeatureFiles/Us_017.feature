Feature: Grading Feature


Background:
Given Navigate to Campus
When The user types username and password and click login button
Then The user verifies login successfully

  Scenario: Download the document to the device
    Given Grading is clicked on the hamburger menu
    When User clicks rating and print image
    Then Downloads the document to the computer
