package com.hillel.rest.usertest;

import com.hillel.rest.core.UserRequest;
import com.hillel.rest.dto.user.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserCreationTest {

    private static UserRequest userRequest;
    private static User expectedUser;

    @BeforeAll
    static void init() {
        userRequest = new UserRequest();
        expectedUser = User
                .builder()
                .name("pikachu")
                .job("pokemon")
                .build();
    }

    @Test
    void testUserCreation() {
        User actualUser = userRequest.createUser("pikachu", "pokemon")
                .then()
                .statusCode(201)
                .extract()
                .as(User.class);
        assertThat(actualUser).isEqualToIgnoringGivenFields(expectedUser, "id", "createdAt");
    }
}
