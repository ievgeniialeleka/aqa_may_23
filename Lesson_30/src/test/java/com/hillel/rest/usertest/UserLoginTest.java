package com.hillel.rest.usertest;

import com.hillel.rest.core.UserLoginRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserLoginTest {
    private static UserLoginRequest userLoginRequest;

    @BeforeAll
    static void init() {
        userLoginRequest = new UserLoginRequest();
    }

    @Test
    void testSuccessfulRegistration() {
       String token = userLoginRequest.loginSuccessfully("eve.holt@reqres.in", "cityslicka")
               .then()
               .statusCode(200)
               .extract()
               .jsonPath()
               .getString("token");
       Assertions.assertEquals("QpwL5tke4Pnpja7X4", token);
    }

    @Test
    void testUnsuccessfulRegistration() {
        String error = userLoginRequest.loginUnsuccessfully("peter@klaven")
                .then()
                .statusCode(400)
                .extract()
                .jsonPath()
                .getString("error");
        Assertions.assertEquals("Missing password", error);
    }
}
