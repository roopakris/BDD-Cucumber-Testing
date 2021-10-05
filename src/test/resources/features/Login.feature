Feature: Login to Nope

  @smoketest
  Scenario: login
    Given user is on loginpage
    When user Enters valid username and password
    Then user should login to Nope