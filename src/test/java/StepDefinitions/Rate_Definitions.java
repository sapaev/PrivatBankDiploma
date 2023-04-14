package StepDefinitions;

import PrivatBankPages.PrivatbankRate;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import libs.DriverHelper;
import libs.LibsOfRate;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class Rate_Definitions {

    DriverHelper driverHelper;
    WebDriver driver;
    Logger logger = Logger.getLogger(getClass());

    @Before(order = 0)
    public void setUp() {
        driverHelper = new DriverHelper();
        driverHelper.createWebDriver();
        logger.info("");
    }


    @Test
    public void lastTest() {
        PrivatbankRate privatbankRate = new PrivatbankRate(DriverHelper.getWebDriver());
        privatbankRate.openPrivatBankPage();
        privatbankRate.getBuyCurrencyRate("USD");
        privatbankRate.getSellCurrencyRate("USD");
        System.out.println(LibsOfRate.sellCurrencyUI);
        System.out.println(LibsOfRate.byeCurrencyUI);
    }


    @After(order = 0)
    public void tearDown() {

        driverHelper.closeBrowser();
    }






    @Given("^User opens 'PrivatbankRate' page$")
    public void user_opens_PrivatbankRate_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user sees the exchange rate of the currency USD for sale on the page 'PrivatbankRate'$")
    public void the_user_sees_the_exchange_rate_of_the_currency_USD_for_sale_on_the_page_PrivatbankRate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user sees the exchange rate of the currency USD for purchase on the page 'PrivatbankRate'$")
    public void the_user_sees_the_exchange_rate_of_the_currency_USD_for_purchase_on_the_page_PrivatbankRate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user received the exchange rate of the currency USD for sale using the API$")
    public void the_user_received_the_exchange_rate_of_the_currency_USD_for_sale_using_the_API() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user received the exchange rate of the currency USD for a purchase using the API$")
    public void the_user_received_the_exchange_rate_of_the_currency_USD_for_a_purchase_using_the_API() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The exchange rate for buying and selling currency USD on the 'PrivatbankRate' page matches the exchange rate for USD by API$")
    public void the_exchange_rate_for_buying_and_selling_currency_USD_on_the_PrivatbankRate_page_matches_the_exchange_rate_for_USD_by_API() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user sees the exchange rate of the currency EUR for sale on the page 'PrivatbankRate'$")
    public void the_user_sees_the_exchange_rate_of_the_currency_EUR_for_sale_on_the_page_PrivatbankRate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user sees the exchange rate of the currency EUR for purchase on the page 'PrivatbankRate'$")
    public void the_user_sees_the_exchange_rate_of_the_currency_EUR_for_purchase_on_the_page_PrivatbankRate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user received the exchange rate of the currency EUR for sale using the API$")
    public void the_user_received_the_exchange_rate_of_the_currency_EUR_for_sale_using_the_API() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^The user received the exchange rate of the currency EUR for a purchase using the API$")
    public void the_user_received_the_exchange_rate_of_the_currency_EUR_for_a_purchase_using_the_API() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The exchange rate for buying and selling currency EUR on the 'PrivatbankRate' page matches the exchange rate for EUR by API$")
    public void the_exchange_rate_for_buying_and_selling_currency_EUR_on_the_PrivatbankRate_page_matches_the_exchange_rate_for_EUR_by_API() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    Process finished with exit code 0





}





