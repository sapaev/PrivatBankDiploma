package tests;

import api.ApiHelper;
import org.junit.Test;

public class ApiTest {


    ApiHelper apiHelper=new ApiHelper();



   @Test
    public void getRequest(){
        apiHelper.getRate();
    }

}
