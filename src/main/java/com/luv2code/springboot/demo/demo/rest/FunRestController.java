package com.luv2code.springboot.demo.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @GetMapping("/start")
    public String seyHello() {
        return "Hello: " + coachName;
    }
}
