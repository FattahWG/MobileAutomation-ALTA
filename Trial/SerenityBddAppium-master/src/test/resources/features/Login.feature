@Login @Android
Feature: Login

  @positive
  Scenario: Verify user successfully login when input valid user data 1
    Given User is on login page
    When User input username
    And User input password
    And User click button sign in
    Then User successfully log in

  @positive @Testing
  Scenario: Verify user successfully login when input valid user data 2
    Given User is on login page
    When User input username "admin"
    And User input password "admin"
    And User click button sign in
    Then User successfully log in

  @positive
  Scenario: Verify user successfully login when input valid user data 3
    Given User is on login page
    When User login with valid user data
    Then User successfully log in