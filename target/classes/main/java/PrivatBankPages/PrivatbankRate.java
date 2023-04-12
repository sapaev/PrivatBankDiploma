package PrivatBankPages;


import libs.LibsOfRate;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrivatbankRate {
    protected WebDriver driver;

    public PrivatbankRate(WebDriver driver) {

        this.driver = driver;
    }

    Logger logger = Logger.getLogger(getClass());


   String sellCurrency="//td[@id='%s_sell']";

   String buyCurrency="//td[@id='%s_buy']";



   public void openPrivatBankPage(){
       driver.get("https://privatbank.ua/");
   }



   public String getSellCurrencyRate(String currency){
       isElementDisplayed(String.format(sellCurrency,currency));
       WebElement currencyElement= driver.findElement(By.xpath(String.format(sellCurrency,currency)));
       LibsOfRate.sellCurrencyUI=currencyElement.getText();
       return currencyElement.getText();
   }


    public String getBuyCurrencyRate(String currency){
        isElementDisplayed(String.format(buyCurrency,currency));
        WebElement currencyElement= driver.findElement(By.xpath(String.format(buyCurrency,currency)));
        LibsOfRate.byeCurrencyUI=currencyElement.getText();
        return currencyElement.getText();
    }









    protected boolean isElementDisplayed(String text) {
        WebElement webElement=driver.findElement(By.xpath(text));
        return isElementDisplayed(webElement);
    }



    protected boolean isElementDisplayed(WebElement webElement) {
        try {
            boolean state= webElement.isDisplayed();
            String message;

            if(state){
                message=getElementName(webElement)+" Element is displayed";
            }else {
                message=getElementName(webElement)+" Element is not displayed";
            }

            logger.info(message);
            return state;

        } catch (Exception e) {
            logger.info("element is not displayed");
            return false;
        }

    }


    private String getElementName(WebElement webElement){
        try {
            return webElement.getAccessibleName();
        }catch (Exception e){
            return "";
        }

    }


}
