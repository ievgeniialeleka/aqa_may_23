package com.hillel.rest.usertest;

import com.hillel.rest.core.UserRegistrationRequest;
import com.hillel.rest.dto.user.RegisteredUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserRegistrationTest {

    private static UserRegistrationRequest userRegistrationRequest;
    private static RegisteredUser expectedUser;

    @BeforeAll
    static void init() {
        userRegistrationRequest = new UserRegistrationRequest();
        expectedUser = RegisteredUser.builder()
                .id(4)
                .token("QpwL5tke4Pnpja7X4")
                .build();
    }

    @Test
    void testSuccessfulRegistration() {
        RegisteredUser registeredUser = userRegistrationRequest.registerSuccessfully("eve.holt@reqres.in", "pistol")
                .then()
                .statusCode(200)
                .extract()
                .as(RegisteredUser.class);
        assertThat(registeredUser).isEqualToIgnoringGivenFields(expectedUser, "email", "password");
    }

    @Test
    void testUnsuccessfulRegistration() {
        String error = userRegistrationRequest.registerUnsuccessfully("sydney@fife")
                .then()
                .statusCode(400)
                .extract()
                .jsonPath()
                .getString("error");
        Assertions.assertEquals("Missing password", error);
    }
}
