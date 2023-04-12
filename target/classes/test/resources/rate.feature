Feature: User login

  @R0029
  Scenario Outline: R0029 Check rate of currency on 'PrivatbankRate' page
    Given User opens 'PrivatbankRate' page
    When User sees rate of currency '<currencyOnUI>'  on 'PrivatbankRate' page
    And User opens 'PrivatbankRate' page
    And User opens 'PrivatbankRate' page
    Then User opens 'PrivatbankRate' page

    Examples:
      | currencyOnUI | password    |
      |USD           | 1234qwerty  |
      |EUR           | 12dthhwerty |