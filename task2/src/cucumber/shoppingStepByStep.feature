Feature: Shopping step by step

  Scenario Outline: Going through the purchasing process
    Given User is logged
    When search Hummingbird Printed Sweater
    Then a product search page will open
    When clicking Hummingbird Printed Sweater
    Then product page is open
    When the selected size is M
    Then M size is selected
    When  set the "<quantity>" to 5 and clicking button Add to cart
    Then Product successfully added to your shopping cart
    When use PROCEED TO CHECKOUT
    Then will find ourselves in the basket
    And clicking button PROCEED TO CHECKOUT
    When address is selected click continue
    When presta shop is selected click continue
    When payment is selected click pay by check
    And selected agree checkbox and click Order with an obligation to pay
    When Order is done take screenshot and save as desktop





    Examples:

    |quantity|
    |5       |



