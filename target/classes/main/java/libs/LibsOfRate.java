package libs;

import PrivatBankPages.PrivatbankRate;
import org.openqa.selenium.WebDriver;

public class LibsOfRate {

    protected WebDriver driver;


    PrivatbankRate privatbankRate =new PrivatbankRate(driver);

    public String sellCurrencyEUR= privatbankRate.getSellCurrencyRate("EUR");
    public String byeCurrencyEUR= privatbankRate.getBuyCurrencyRate("EUR");

    public String sellCurrencyUSD= privatbankRate.getSellCurrencyRate("USD");
    public String byeCurrencyUSD= privatbankRate.getBuyCurrencyRate("USD");



}
