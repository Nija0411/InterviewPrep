package com.testing.practice.test04_RestAssured.RESTFulBooker.BDD;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test01_BDD {

    String body = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    //URL = https://restful-booker.herokuapp.com/auth
    @Test
    public void createToken() {
        RestAssured.
        given().
                baseUri("https://restful-booker.herokuapp.com/").
                basePath("auth").
                header("Content-Type","application/json").
                body(body).
        when().
                post().
        then().
                log().all().
                statusCode(200);
    }
}
