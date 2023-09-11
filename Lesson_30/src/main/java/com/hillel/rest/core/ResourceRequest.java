package com.hillel.rest.core;

import io.restassured.response.Response;

public class ResourceRequest extends AbstractRequest {
    private static final String RELATIVE_URL = "/api/unknown";

    public Response getResourceById(String id) {
        return getSpec().
                get(RELATIVE_URL + "/" + id);
    }

    public Response getListOfResources() {
        return getSpec()
                .get(RELATIVE_URL);
    }
    public Response singleResourceNotFound() {
        return getSpec()
                .get(RELATIVE_URL + "/23");
    }
}
