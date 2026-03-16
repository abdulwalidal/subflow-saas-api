package com.abdulwali.subflowsaas_api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class healthcheck {

    @GetMapping
    public String health_check() {
        return "it is working";
    }

}
