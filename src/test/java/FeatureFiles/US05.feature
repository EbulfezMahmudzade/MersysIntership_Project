Feature: Send Message

  Background:
    Given Navigate to Campus Website
    When The users types username and password and click login button
    Then The users verifies login successfully



  Scenario: Send Message student
    And Navigate to hamburger menu
    When Navigate to message
    And Send Message
    Given Click to Users Icon
    When Write "stu" in input

  Scenario: Send Message teacher
    And Navigate to hamburger menu
    When Navigate to message
    And Send Message
    Given Click to Users Icon
    When Write "tea" in input

  Scenario: Send Message recipient name
    And Navigate to hamburger menu
    When Navigate to message
    And Send Message
    Given Click to Users Icon
    When Write "stu" in input
    And Click to user recipient name
    When Write "tea" in input
    And Click to user recipient name addAndClose
    When send also via selected
    And  enter subject
    Then Is displayed successfully

