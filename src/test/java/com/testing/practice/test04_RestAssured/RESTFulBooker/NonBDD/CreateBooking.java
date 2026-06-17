package com.testing.practice.test04_RestAssured.RESTFulBooker.NonBDD;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateBooking {
    RequestSpecification rSpecification;
    Response response;
    ValidatableResponse vResponse;

    String token = "4e6619b1aa71082";

    String body = "{\n" +
            "    \"firstname\" : \"Nikhita\",\n" +
            "    \"lastname\" : \"J\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";

    @Test
    public void createBooking() {

        rSpecification = RestAssured.given();
        rSpecification.baseUri("https://restful-booker.herokuapp.com");
        rSpecification.basePath("/booking");
        rSpecification.contentType(ContentType.JSON);
        rSpecification.header("authorization", token);
        rSpecification.body(body);

        response = rSpecification.when().post();

        vResponse = response.then();
        vResponse.log().all();
        int bookingID = vResponse.statusCode(200).extract().path("bookingID");

        Assert.assertEquals(response.getStatusCode(), 200);

        String firstName = response.jsonPath().getString("booking.firstname");
        String lastName = response.jsonPath().getString("booking.lastname");

        Assert.assertEquals(firstName, "Nikhita");
        Assert.assertEquals(lastName, "J");

        rSpecification.given();
        rSpecification.baseUri("https://restful-booker.herokuapp.com");
        rSpecification.basePath("/booking/" + bookingID);
        rSpecification.contentType(ContentType.JSON);
        rSpecification.header("authorization", token);

        response = rSpecification.when().post();
        vResponse = response.then();
        vResponse.log().all();
        vResponse.statusCode(200);
    }

}
