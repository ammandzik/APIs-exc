package com.example.demo.controller;

import com.example.demo.model.CityResponse;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/catalog")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/city/{cityName}")
    public ResponseEntity<Mono<CityResponse>> getCityDetails(@PathVariable String cityName) {

        return ResponseEntity.ok(service.getCityDetails(cityName));
    }


}
