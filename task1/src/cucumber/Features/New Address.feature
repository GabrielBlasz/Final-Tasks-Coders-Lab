Feature: Adding Address
  Scenario Outline: Adding new address
    Given the user is on the page with adding a new address
    When presses the create address button
    Then fill in the form with data "<alias>" "<address>" "<postalCode>" "<city>" "<country>" "<phone>"
    And check if the given data is correct



   Examples:

    Examples:
      | alias         | address            | postalCode     | city        | country        | phone     |
      | first address | Braci Mniejszych 1 | 01-999         | Warszawa    | United Kingdom | 555333111 |


