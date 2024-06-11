# Author: Shafira Ayu Maharani
# Date : 11 June 2024
# Desc


Feature: Register

  Scenario: Register new account distributor

    Given User on register page
    When User input all field
    And choose distributor as Tipe Bisnis
    And clicks register button
    Then User is navigated to activation account page


  Scenario: Register new account retail

    Given User on register page
    When User input all field
    And choose retail as Tipe Bisnis
    And clicks register button
    Then User is navigated to activation account page

  Scenario: Register new account brand

    Given User on register page
    When User input all field
    And choose brand as Tipe Bisnis
    And clicks register button
    Then User is navigated to activation account page

  Scenario: Register new account seller online

    Given User on register page
    When User input all field
    And choose seller online as Tipe Bisnis
    And clicks register button
    Then User is navigated to activation account page