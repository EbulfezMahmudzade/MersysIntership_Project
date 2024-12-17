Feature:Search for Assignments

  Background:
    Given Navigate to Campus Website
    When The users types username and password and click login button
    Then The users verifies login successfully

  Scenario: Successful Searching in Assignments
    When Navigate to the assignment select filter and search
    Then from the drop-down sort menu select and verify show by course, type, date and chart