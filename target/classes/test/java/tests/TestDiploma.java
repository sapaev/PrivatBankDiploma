package tests;





import api.ApiHelper;
import libs.LibsOfRate;
import org.junit.Assert;
import org.junit.Test;

public class TestDiploma extends BaseTest{





    @Test
    public void writeRate(){
       privatbankRate.openPrivatBankPage();
        System.out.println(privatbankRate.getSellCurrencyRate("EUR"));
        System.out.println(privatbankRate.getSellCurrencyRate("USD"));

        System.out.println(privatbankRate.getBuyCurrencyRate("EUR"));
        System.out.println(privatbankRate.getBuyCurrencyRate("USD"));


        System.out.println("--------------"+LibsOfRate.byeCurrencyUI);
        System.out.println("--------------"+LibsOfRate.sellCurrencyUI);
    }



    @Test
    public void lastTest(){
        ApiHelper apiHelper=new ApiHelper();
        apiHelper.getRateSellCurrency("USD");
        apiHelper.getRateBuyCurrency("USD");

        privatbankRate.openPrivatBankPage();
        privatbankRate.getBuyCurrencyRate("USD");
        privatbankRate.getSellCurrencyRate("USD");
        System.out.println(LibsOfRate.sellCurrencyUI);
        System.out.println(LibsOfRate.byeCurrencyUI);
        System.out.println(LibsOfRate.sellCurrencyAPI);
        System.out.println(LibsOfRate.buyCurrencyAPI);

        double sellCurrencyUI=Double.parseDouble(LibsOfRate.sellCurrencyUI);
        double byeCurrencyUI=Double.parseDouble(LibsOfRate.byeCurrencyUI);
        double sellCurrencyAPI=Double.parseDouble(LibsOfRate.sellCurrencyAPI);
        double buyCurrencyAPI=Double.parseDouble(LibsOfRate.buyCurrencyAPI);

        System.out.println(sellCurrencyUI);
        System.out.println(byeCurrencyUI);
        System.out.println(sellCurrencyAPI);
        System.out.println(buyCurrencyAPI);

        Assert.assertTrue(sellCurrencyUI==sellCurrencyAPI && byeCurrencyUI==buyCurrencyAPI);



    }




}
