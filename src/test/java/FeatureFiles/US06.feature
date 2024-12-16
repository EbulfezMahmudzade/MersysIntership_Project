Feature: Outbox Feature

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button

  Scenario: Send Message
    Given Navigate to hamburger menu
    When Navigate to message
    And Navigate to outbox
    Then Is displayed Move to Trash
    And Click to Move to trash
    Then Is displayed confirm
    And Click to Yes
    Then Is displayed successfully
