package StepDefinitions;


import PrivatBankPages.PrivatbankRate;
import api.ApiHelper;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import libs.DriverHelper;
import org.apache.log4j.Logger;

public class Hooks {

    DriverHelper driverHelper=new DriverHelper();
    Logger logger=Logger.getLogger(getClass());


    @Before(order = 0)
    public void setUp(){
      driverHelper.createWebDriver();
      logger.info("");
      PrivatbankRate privatbankRate=new PrivatbankRate(DriverHelper.getWebDriver());
      ApiHelper apiHelper=new ApiHelper();
    }



    @After(order = 0)
    public void tearDown(){
    driverHelper.closeBrowser();
    }







}
