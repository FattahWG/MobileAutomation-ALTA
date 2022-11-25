@list @android
Feature: List Page

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    Then user go to list menu

  @scroll
  Scenario: user scroll on list page
    When user on list page
    Then user do scroll

  @longPress
  Scenario: user long press on list page
    When user on list page
    Then User doing long press in the list

  @multipleTaps
  Scenario: user multiple taps on list page
    When user on list page
    Then User doing tap multiple times in the list