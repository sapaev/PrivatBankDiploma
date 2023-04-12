Feature: User login

  @R0029
  Scenario Outline: R0029 Check rate of currency on 'PrivatbankRate' page
    Given User opens 'PrivatbankRate' page
    When The user sees the exchange rate of the currency <currencyOnUI> for sale on the page 'PrivatbankRate'
    And The user sees the exchange rate of the currency <currencyOnUI> for purchase on the page 'PrivatbankRate'
    And The user received the exchange rate of the currency <currencyOnAPI> for sale using the API
    And The user received the exchange rate of the currency <currencyOnAPI> for a purchase using the API
    Then The exchange rate for buying and selling currency <currencyOnUI> on the 'PrivatbankRate' page matches the exchange rate for <currencyOnAPI> by API

    Examples:
      | currencyOnUI | currencyOnAPI |
      |USD           | USD           |
      |EUR           | EUR           |