Feature: Facebook Login

  Scenario: Successful login with valid credentials
    Given User is on Facebook login page
    When User enters username and password
    Then User should be redirected to homepage
