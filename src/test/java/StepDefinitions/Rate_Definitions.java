package StepDefinitions;

import PrivatBankPages.PrivatbankRate;
import cucumber.api.java.After;
import cucumber.api.java.Before;
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

}
