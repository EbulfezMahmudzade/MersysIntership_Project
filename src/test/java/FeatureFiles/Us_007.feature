Feature: Hamburger Menu Messaging Functionality

 Background:
   Given Navigate to Campus Website
   When The users types username and password and click login button
   Then The users verifies login successfully

  Scenario: Manage messages.

    Given The Write Message option should be clicked on the Hamburger Menu.
    When Write new message links must be seen and clicked
    Then Clicked Messages

  Scenario: Share the message.

    Given Click Message from the hamburger menu
    When Student chooses the people to send messages to and sends the message
    Then Sees sent messages in the list

  Scenario: Edit messages.

    Given Hamburger clicks on the message button from the menu and clicks on the outbox box
    When You should see a confirmation button to delete the message
    Then Message deleted successfully


    Scenario: Recovering and permanently deleting deleted messages.

      Given Click on the messaging trash box from the hamburger menu
      When You should see a delete and undo icon
      Then  Messages deleted successfully



