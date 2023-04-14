package api;


import dto.EndpointsPrivatBank;
import dto.responseDTO_Diploma.RateDTO;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import libs.LibsOfRate;
import org.apache.log4j.Logger;
import org.junit.Assert;


import java.util.List;

import static io.restassured.RestAssured.given;

public class ApiHelper {



    private Logger logger=Logger.getLogger(getClass());

    RequestSpecification requestSpecification=new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .log(LogDetail.ALL).build();



    public void getRate(){
         given().contentType(ContentType.JSON).log().all()
                 .when()
                 .get(EndpointsPrivatBank.getRate,5)
                 .then().statusCode(200)
                 .log().all()
                 .extract().response().getBody().as(RateDTO[].class);

    }


    public void checkListOfCurrency(String currency){
        Response responseOfRate=given().contentType(ContentType.JSON).log().all()
                .when()
                .get(EndpointsPrivatBank.getRate,5)
                .then().statusCode(200)
                .log().all()
                .extract().response();

        List<String>actualListOfCurrencies=responseOfRate.jsonPath().getList("ccy", String.class);
        int i=0;
        for(String actualCurrency:actualListOfCurrencies){
            if (actualCurrency.equalsIgnoreCase(currency)){
                i++;
            }
        }
      Assert.assertTrue("",i==1);

    }


    public String getRateSellCurrency(String currency){
        RateDTO[] rateDto=given().contentType(ContentType.JSON).log().all()
                .when()
                .get(EndpointsPrivatBank.getRate,5)
                .then().statusCode(200)
                .log().all()
                .extract().response().getBody().as(RateDTO[].class);
        for (int i = 0; i < rateDto.length; i++) {
            if (rateDto[i].getCcy().equals(currency)){
                LibsOfRate.sellCurrencyAPI=rateDto[i].getSale();
                return rateDto[i].getSale();
            }
        }
        return "currency was not find";
    }


    public String getRateBuyCurrency(String currency){
        RateDTO[] rateDto=given().contentType(ContentType.JSON).log().all()
                .when()
                .get(EndpointsPrivatBank.getRate,5)
                .then().statusCode(200)
                .log().all()
                .extract().response().getBody().as(RateDTO[].class);
        for (int i = 0; i < rateDto.length; i++) {
            if (rateDto[i].getCcy().equals(currency)){
                LibsOfRate.buyCurrencyAPI=rateDto[i].getBuy();
                return rateDto[i].getBuy();
            }
        }
        return "currency was not find";
    }

}
