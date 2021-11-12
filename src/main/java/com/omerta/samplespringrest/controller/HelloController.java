package com.omerta.samplespringrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String test(){
        return "Hello "+Instant.now().toString();
    }
}
