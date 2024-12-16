Feature: Outbox Feature

  Background:
    Given Navigate to Campus Website
    When The users types username and password and click login button
    Then The users verifies login successfully


  Scenario: Send Message
    Given Navigate to hamburger menu
    When Navigate to message
    And Navigate to outbox
    Then Is displayed Move to Trash
    And Click to Move to trash
    Then Is displayed confirm
    And Click to Yes
    Then Is displayed successfully
