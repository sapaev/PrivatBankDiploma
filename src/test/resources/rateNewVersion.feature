Feature: Check rate

  @R0030
  Scenario Outline: R0030 Check rate of currency on 'PrivatbankRate' page
    Given User opens 'PrivatbankRate' page
    When The user sees the exchange rate of the currency '<currencyOnUI>' for sale on the page 'PrivatbankRate'
    And The user sees the exchange rate of the currency '<currencyOnUI>' for buy on the page 'PrivatbankRate'
    And The user received the exchange rate of the currency '<currencyOnAPI>' for sale and buy using the API
    Then The exchange rate for buying and selling currency on the 'PrivatbankRate' page matches the exchange rate for currency by API

    Examples:
      | currencyOnUI | currencyOnAPI |
      |USD           | USD           |
      |EUR           | EUR           |
