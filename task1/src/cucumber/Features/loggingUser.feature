Feature: Logging in
  Scenario: Logging site https://mystore-testlab.coderslab.pl
    Given open the login window
    When the form is completed
    Then succes login
    And go to the adress tab
