package com.hillel.rest.usertest;

import com.hillel.rest.core.UserRequest;
import com.hillel.rest.dto.user.DataUser;
import com.hillel.rest.dto.user.UserInfo;
import com.hillel.rest.dto.user.UsersList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    private UserRequest userRequest = new UserRequest();

    @Test
    void testGetUserById() {
        UserInfo user = userRequest.getUserById("2")
                .then()
                .statusCode(200)
                .extract()
                .as(UserInfo.class);
        assertThat(user.getData().getFirst_name()).isEqualTo("Janet");
        assertThat(user.getData().getLast_name()).isEqualTo("Weaver");
        assertThat(user.getData().getEmail()).isEqualTo("janet.weaver@reqres.in");
        assertThat(user.getData().getAvatar()).isEqualTo("https://reqres.in/img/faces/2-image.jpg");
    }

    @Test
    void testGetUsersByPage() {
        UsersList users = userRequest.getUsersByPage("2").then().extract().as(UsersList.class);
        Assertions.assertTrue(Arrays.stream(users.getData())
                .map(DataUser::getEmail)
                .allMatch(email -> email.contains("@")));
        Assertions.assertTrue(Arrays.stream(users.getData())
                .map(DataUser::getAvatar)
                .allMatch(avatar -> avatar.contains("image.jpg")));
        Assertions.assertTrue(Arrays.stream(users.getData())
                .filter(user -> user.getId() == 8)
                .map(DataUser::getFirst_name)
                .allMatch(firstName -> firstName.equals("Lindsay")));
        Assertions.assertTrue(Arrays.stream(users.getData())
                .filter(user -> user.getId() == 11)
                .map(DataUser::getLast_name)
                .allMatch(lastName -> lastName.equals("Edwards")));
    }

    @Test
    void testSingleUserNotFound() {
        userRequest.getUserById("23")
                .then()
                .statusCode(404);
    }

    @Test
    void testUserUpdate() {
        String updatedJob = userRequest.updateUser("pikachu", "president")
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getString("job");
        assertThat(updatedJob).isEqualTo("president");
    }

    @Test
    void testUserDeletion() {
        userRequest.deleteUser()
                .then()
                .statusCode(204);
    }

    @Test
    void testDelayedResponse() {
        long before = System.currentTimeMillis();
        userRequest.delayedResponse()
                .then()
                .statusCode(200)
                .extract()
                .as(UsersList.class);
        long after = System.currentTimeMillis();
        long delay = after - before;
        Assertions.assertTrue(delay > 3000);
    }
}
