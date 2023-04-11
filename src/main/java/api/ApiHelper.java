package api;


import dto.EndpointsPrivatBank;
import dto.responseDTO_Diploma.RateDTO;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;


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
}
