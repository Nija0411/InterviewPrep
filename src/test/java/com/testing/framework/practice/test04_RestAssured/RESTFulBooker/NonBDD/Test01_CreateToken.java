package com.testing.framework.practice.test04_RestAssured.RESTFulBooker.NonBDD;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test01_CreateToken {
    RequestSpecification reqSpecification;
    Response response;
    ValidatableResponse vResponse;

    String body = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    @Test
    public void createToken() {
        reqSpecification = RestAssured.given();
        reqSpecification.baseUri("https://restful-booker.herokuapp.com/");
        reqSpecification.basePath("auth");
        reqSpecification.header("Content-Type", "application/json");
        reqSpecification.body(body);

        response = reqSpecification.when().post();

        vResponse = response.then();
        vResponse.log().all();
        vResponse.statusCode(200);

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
