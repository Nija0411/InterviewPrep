package com.testing.practice.interviewDone.fynd;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TumyAPI {

    RequestSpecification reqSpecification;
    Response response;
    ValidatableResponse vResponse;

    String body = "{\"mobile\":\"8888888888\",\"country_code\":\"91\"}";

    @Test

    public void testLogin() {

        reqSpecification = RestAssured.given().baseUri("https://tumi-ratl.fynd.io/api/service/application/user/authentication/v1.0/login/otp?platform=686231550ec45a2e58b4b146").
                accept(ContentType.JSON).body(body).
                header("authorization", "Njg2MjMxNTUwZWM0NWEyZTU4YjRiMTQ2OkI2U3ZmcUdydg==").header("x-currency-code", "INR").header("x-fp-date", "20251120T094022Z").
                header("x-fp-signature", "v1.1:55fdd7e24a8de8ed3351898f5e897330cfd0833c25ff853123af4c83d3269e0f").
                header("x-location-detail", "{\"country_iso_code\":\"IN\"}").header("Cookie", "anonymous_id=757d4b8cee6544bda288a190de4f0989; old_browser_anonymous_id=757d4b8cee6544bda288a190de4f0989");

        response = reqSpecification.when().post();
        vResponse = response.then().statusCode(200);

    }
}
