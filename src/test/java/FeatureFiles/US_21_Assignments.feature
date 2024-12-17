Feature:Assignments File Upload

  Background:
    Given Navigate to Campus Website
    When The users types username and password and click login button
    Then The users verifies login successfully

  Scenario: Successful Assignment Upload
    When Navigate to the assignment select filter and search
    And Checking the transactions on the homework page