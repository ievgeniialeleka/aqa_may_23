package com.hillel.rest.core;

import com.hillel.rest.dto.user.RegisteredUser;
import io.restassured.response.Response;

public class UserRegistrationRequest extends AbstractRequest  {
    private static final String RELATIVE_URI = "/api/register";

    public Response registerSuccessfully(String email, String password) {
        return getSpec()
                .when()
                .body(RegisteredUser.builder().email(email).password(password).build())
                .post(RELATIVE_URI);
    }

    public Response registerUnsuccessfully(String email) {
        return getSpec()
                .when()
                .body(RegisteredUser.builder().email(email).build())
                .post(RELATIVE_URI);
    }
}
