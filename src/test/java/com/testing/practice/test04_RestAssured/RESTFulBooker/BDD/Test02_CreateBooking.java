package com.testing.practice.test04_RestAssured.RESTFulBooker.BDD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Test02_CreateBooking {

    //URL = https://restful-booker.herokuapp.com/booking
    String body = "{\n" +
            "    \"firstname\" : \"Jim\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";

    String token = "24d4d076a5c2f93";

    @Test
    public void createBooking() {
        RestAssured.
        given().
                baseUri("https://restful-booker.herokuapp.com/").
                basePath("booking").
                contentType(ContentType.JSON).
                cookie("token",token).
                body(body).
        when().log().all().
                post().
        then().log().all().
                statusCode(200);

    }
}
