package com.tomw.springcourse.controllers;

import com.tomw.springcourse.entities.Greeting;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/rest")
    public Greeting greet(@RequestParam(required = false, defaultValue = "World") String name) {
        return new Greeting(String.format("Hello, %s!", name));
    }
}
