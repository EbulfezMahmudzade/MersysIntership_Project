Feature: Assignments Feature


  Background:
    Given Navigate to Campus Website
    When The users types username and password and click login button
    Then The users verifies login successfully

  Scenario: Creating a Work Plan
    Given Click on assingnments from the hamburger menu
    When Student should see the total number of assignments
    Then Student must see all tasks