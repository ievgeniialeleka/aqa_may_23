package com.hillel.rest.core;

import io.restassured.RestAssured;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;

public class AbstractRequest {
    private final static String BASE_URL = "https://reqres.in/";

    protected RequestSpecification getSpec() {
        return new RestAssured()
                .given()
                .spec(new RequestSpecBuilder()
                        .setBaseUri(BASE_URL)
                        .setContentType(ContentType.JSON)
                        .addFilter(new ResponseLoggingFilter())
                        .build());
    }
}
