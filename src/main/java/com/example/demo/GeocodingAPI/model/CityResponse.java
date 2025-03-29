package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CityResponse {

    @JsonProperty("results")
    private List<CityResult> results;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CityResult {
        @JsonProperty("id")
        private Integer id;

        @JsonProperty("name")
        private String name;

        @JsonProperty("country")
        private String country;

        @JsonProperty("timezone")
        private String timezone;

        @JsonProperty("population")
        private Integer population;
    }
}