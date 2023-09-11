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
public class ResourceInfo {
    private DataResource data;
    private Support support;
}
