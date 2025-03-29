package com.example.demo.GeocodingAPI.service;

import com.example.demo.model.CityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CountryService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<CityResponse> getCityDetails(String city) {

        return webClientBuilder.baseUrl("https://geocoding-api.open-meteo.com")
                .build()
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("v1/search")
                        .queryParam("name", city)
                        .queryParam("count", 1)
                        .build())
                .retrieve()
                .bodyToMono(CityResponse.class);
    }


}
