package com.hillel.rest.resourcetest;

import com.hillel.rest.core.ResourceRequest;
import com.hillel.rest.dto.resource.DataResource;
import com.hillel.rest.dto.resource.ResourceInfo;
import com.hillel.rest.dto.resource.ResourceList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ResourceTest {

    private static ResourceRequest resourceRequest;

    @BeforeAll
    static void init() {
        resourceRequest = new ResourceRequest();
    }

    @Test
    void testGetResourceById() {
        ResourceInfo resource = resourceRequest.getResourceById("2")
                .then()
                .statusCode(200)
                .extract()
                .as(ResourceInfo.class);
        Assertions.assertEquals("fuchsia rose", resource.getData().getName());
        Assertions.assertEquals(2001, resource.getData().getYear());
        Assertions.assertEquals("#C74375", resource.getData().getColor());
        Assertions.assertEquals("17-2031", resource.getData().getPantone_value());
    }

    @Test
    void testGetListOfResources() {
        ResourceList resources = resourceRequest.getListOfResources().then().statusCode(200).extract().as(ResourceList.class);
        Assertions.assertTrue(Arrays.stream(resources.getData()).count() == 6);
        Assertions.assertTrue(Arrays.asList(resources.getData()).stream()
                .filter(resource -> resource.getId() == 3)
                .map(DataResource::getName)
                .allMatch(name -> name.equals("true red")));
        Assertions.assertTrue(Arrays.asList(resources.getData()).stream()
                .filter(resource -> resource.getId() == 6)
                .map(DataResource::getPantone_value)
                .allMatch(name -> name.equals("15-5217")));
        Assertions.assertTrue(Arrays.asList(resources.getData()).stream()
                .filter(resource -> resource.getId() == 4)
                .map(DataResource::getYear)
                .allMatch(year -> year == 2003));
        Assertions.assertTrue(Arrays.asList(resources.getData()).stream()
                .map(DataResource::getColor)
                .allMatch(color -> color.contains("#")));
    }

    @Test
    void testSingleResourceNotFound() {
        resourceRequest.singleResourceNotFound().then().statusCode(404);
    }
}
