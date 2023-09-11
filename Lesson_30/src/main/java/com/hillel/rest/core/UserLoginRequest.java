package com.hillel.rest.core;

import com.hillel.rest.dto.user.RegisteredUser;
import io.restassured.response.Response;

public class UserLoginRequest extends AbstractRequest {
    private static final String RELATIVE_URI = "/api/login";

    public Response loginSuccessfully(String email, String password) {
        return getSpec()
                .when()
                .body(RegisteredUser.builder().email(email).password(password).build())
                .post(RELATIVE_URI);
    }

    public Response loginUnsuccessfully(String email) {
        return getSpec()
                .when()
                .body(RegisteredUser.builder().email(email).build())
                .post(RELATIVE_URI);
    }
}
