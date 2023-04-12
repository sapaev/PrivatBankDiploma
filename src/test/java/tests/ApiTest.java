package tests;

import api.ApiHelper;
import libs.LibsOfRate;
import org.junit.Test;

public class ApiTest {


    ApiHelper apiHelper=new ApiHelper();



   @Test
    public void getRequest(){
        //apiHelper.getRate();

       System.out.println(apiHelper.getRateSellCurrency("USD"));
       System.out.println("+++++++++++"+LibsOfRate.sellCurrencyAPI);
       apiHelper.checkListOfCurrency("USD");
    }

}
