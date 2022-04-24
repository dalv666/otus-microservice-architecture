package ru.otus.microservice_architecture.homework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping(path = "/health")
    @ResponseBody
    public String health(){
        return "{\"status\": \"OK\"}";
    }

}
