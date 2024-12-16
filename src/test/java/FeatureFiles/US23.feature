Feature:Calendar Feature

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button

    Scenario: lessons for which I am responsible
      Given navigate to calender
      When visible date and course
      And displayed icons
      Then What do the icons mean
      And is displayed and clickable weekly and calendar
      And is displayed and clickable Previous, Today, Next
      Then is displayed and clickable lessons