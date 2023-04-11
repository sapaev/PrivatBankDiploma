package tests;



import PrivatBankPages.PrivatbankRate;
import libs.LibsOfRate;
import org.junit.Test;

public class TestDiploma extends BaseTest{



    PrivatbankRate privatbankRate=new PrivatbankRate(driver);

    @Test
    public void writeRate(){
//        String byeCurrencyEUR = libsOfRate.byeCurrencyEUR;
//        String sellCurrencyEUR = libsOfRate.sellCurrencyEUR;
//
//        String byeCurrencyUSD = libsOfRate.byeCurrencyUSD;
//        String sellCurrencyUSD = libsOfRate.sellCurrencyUSD;

      //  System.out.println(byeCurrencyEUR+sellCurrencyEUR+byeCurrencyUSD+sellCurrencyUSD );


        System.out.println(privatbankRate.getSellCurrencyRate("EUR"));

    }




}
