package com.hillel.rest.core;

import com.hillel.rest.dto.user.User;
import io.restassured.response.Response;

public class UserRequest extends AbstractRequest {

    private static final String RELATIVE_URI = "api/users";

    public Response getUserById(String id) {
        return getSpec()
                .get(RELATIVE_URI + "/" + id);
    }

    public Response getUsersByPage(String page) {
        return getSpec()
                .when()
                .param("page", 2)
                .get(RELATIVE_URI);
    }
    public Response createUser(String name, String job) {
        return getSpec()
                .when()
                .body(User.builder()
                        .name(name)
                        .job(job)
                        .build())
                .post(RELATIVE_URI);
    }

    public Response updateUser(String name, String job) {
        return getSpec()
                .when()
                .body(User.builder()
                        .name(name)
                        .job(job)
                        .build())
                .put(RELATIVE_URI + "/2");
    }

    public Response deleteUser() {
        return getSpec()
                .delete(RELATIVE_URI + "/2");
    }

    public Response delayedResponse() {
        return getSpec()
                .when()
                .param("delay", 3)
                .get(RELATIVE_URI);
    }
}
