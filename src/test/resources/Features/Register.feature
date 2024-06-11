# Author: Shafira Ayu Maharani
# Date : 11 June 2024
# Desc


Feature: Register

  Scenario: Register new account

    Given User on register page
    When User input all field
    And choose distributor as Tipe Bisnis
    And clicks register button
    Then User is navigated to activation account page