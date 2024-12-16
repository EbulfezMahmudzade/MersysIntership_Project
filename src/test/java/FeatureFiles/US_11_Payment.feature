Feature:Financial Payment

  Background:
    Given Navigate to Campus
    When The user types username and password and click login button
    Then The user verifies login successfully

  Scenario:Successful Payment

    When The user hovers over the Hamburger Menu and clicks on My Finance
    And  The user clicks their name and is redirected to the payment page
    When The user enters the amount and clicks the pay button
    When The user enters their card details
      | cardNumber |
    And  The user confirms the payment
    Then The user displays a confirmation message "Payment Successful"