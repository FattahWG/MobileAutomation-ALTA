@Scrolling
Feature: Scrolling

  Background:
    Given User is on login page
    When User input username "admin"
    And User input password "admin"
    And User click button sign in
    Then User successfully log in

  Scenario: Scroll with pointer
    Given User is already log in
    When User go to second menu
    Then User doing swipe in the screen

  @LongPress
  Scenario: Long press the mobile object
    Given User is already log in
    When User go to second menu
    Then User doing long press in the list

  @TapMultiple
  Scenario: Tap multiple times the mobile object
    Given User is already log in
    When User go to second menu
    Then User doing tap multiple times in the list

  @ScrollToText
  Scenario: Scroll to text the mobile object
    Given User is already log in
    When User go to second menu
    Then User doing scroll to text in the list
