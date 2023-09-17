package com.hillel.rest.dto.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hillel.rest.dto.user.Support;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResourceList {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private DataResource[] data;
    private Support support;
}
