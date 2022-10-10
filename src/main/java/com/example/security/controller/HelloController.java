package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")
public class HelloController {
    @GetMapping(value= "/test")
    public String test(){
        return "test";
    }
    @GetMapping(value= "/hello")
    public String hello(){
        return "hello";
    }
}
