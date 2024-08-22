Feature: BookCart applicaiton demo

  Scenario: Login should be success
    Given user should navigate to the applicaiton
    And user clicks on login link
    And user enters the username as 'ortoni'
    And user enters the password as 'pass1234'
    When user clicks on login button
    Then Login should be success
