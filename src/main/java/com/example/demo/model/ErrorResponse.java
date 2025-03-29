package com.example.demo.model;

public record ErrorResponse(
    int status,
    String reason
){}
