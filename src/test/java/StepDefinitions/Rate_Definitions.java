package StepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import libs.DriverHelper;
import libs.LibsOfRate;
import org.apache.log4j.Logger;
import org.junit.Assert;
import PrivatBankPages.PrivatbankRate;
import api.ApiHelper;



public class Rate_Definitions {

    DriverHelper driverHelper;
    Logger logger = Logger.getLogger(getClass());
    PrivatbankRate privatbankRate=new PrivatbankRate(DriverHelper.getWebDriver());
    ApiHelper apiHelper=new ApiHelper();



    @Given("^User opens 'PrivatbankRate' page$")
    public void user_opens_PrivatbankRate_page() throws Throwable {
        privatbankRate.openPrivatBankPage();
    }

    @When("^The user sees the exchange rate of the currency '(.*)' for sale on the page 'PrivatbankRate'$")
    public void the_user_sees_the_exchange_rate_of_the_currency_USD_for_sale_on_the_page_PrivatbankRate(String currency) throws Throwable {
        privatbankRate.getSellCurrencyRate(currency);
    }

    @When("^The user sees the exchange rate of the currency '(.*)' for buy on the page 'PrivatbankRate'$")
    public void the_user_sees_the_exchange_rate_of_the_currency_USD_for_purchase_on_the_page_PrivatbankRate(String currency) throws Throwable {
        privatbankRate.getBuyCurrencyRate(currency);
    }

    @When("^The user received the exchange rate of the currency '(.*)' for sale and buy using the API$")
    public void the_user_received_the_exchange_rate_of_the_currency_USD_for_sale_using_the_API(String currency) throws Throwable {
        apiHelper.getRateBuyAndSellCurrency(currency);
    }


    @Then("^The exchange rate for buying and selling currency on the 'PrivatbankRate' page matches the exchange rate for currency by API$")
    public void the_exchange_rate_for_buying_and_selling_currency_USD_on_the_PrivatbankRate_page_matches_the_exchange_rate_for_USD_by_API() throws Throwable {
        double sellCurrencyUI=Double.parseDouble(LibsOfRate.sellCurrencyUI);
        double byeCurrencyUI=Double.parseDouble(LibsOfRate.byeCurrencyUI);
        double sellCurrencyAPI=Double.parseDouble(LibsOfRate.sellCurrencyAPI);
        double buyCurrencyAPI=Double.parseDouble(LibsOfRate.buyCurrencyAPI);
        Assert.assertTrue(sellCurrencyUI==sellCurrencyAPI && byeCurrencyUI==buyCurrencyAPI);
    }










}





