@Calculator @android
Feature: Calculator

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

  @sum
  Scenario Outline: User using calculator for sum math
    Given user is on calculator page
    When user input first number <angka1>
    And user input second number <angka2>
    Then user click button result
    And result should be <result>
    Examples:
      | angka1 | angka2 | result        |
      | 1      | 1      | "Hasil : 2"   |
      | 1      | 2      | "Hasil : 3"   |
      | 2      | 1      | "Hasil : 3"   |
      | 50     | 50     | "Hasil : 100" |

  @minus
  Scenario Outline: User using calculator for minus math
    Given user is on calculator page
    When user input first number <angka1>
    And user input second number <angka2>
    Then user click dropdown
    And user select option minus button
    Then user click button result
    And result should be <result>
    Examples:
      | angka1 | angka2 | result       |
      | 1      | 1      | "Hasil : 0"  |
      | 1      | 2      | "Hasil : -1" |
      | 4      | 2      | "Hasil : 2"  |
      | 35     | 5      | "Hasil : 30" |

  @divided
  Scenario Outline: User using calculator for divided math
    Given user is on calculator page
    When user input first number <angka1>
    And user input second number <angka2>
    Then user click dropdown
    And user select option divided button
    Then user click button result
    And result should be <result>
    Examples:
      | angka1 | angka2 | result       |
      | 1      | 1      | "Hasil : 1"  |
      | 4      | 2      | "Hasil : 2"  |
      | 2      | 1      | "Hasil : 2"  |
      | 50     | 5      | "Hasil : 10" |

  @multi
  Scenario Outline: User using calculator for multiple math
    Given user is on calculator page
    When user input first number <angka1>
    And user input second number <angka2>
    Then user click dropdown
    And user select option multiple button
    Then user click button result
    And result should be <result>
    Examples:
      | angka1 | angka2 | result        |
      | 1      | 1      | "Hasil : 1"   |
      | 1      | 2      | "Hasil : 2"   |
      | 2      | 1      | "Hasil : 2"   |
      | 50     | 5      | "Hasil : 250" |


  @math
  Scenario: Calculator cant show decimal result
    Given user is on calculator page
    When user input first number 1
    And user input second number 2
    Then user click dropdown
    And user select option divided button
    Then user click button result
    And result should be "Hasil : 0"




