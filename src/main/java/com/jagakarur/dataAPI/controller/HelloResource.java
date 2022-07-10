package com.jagakarur.dataAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloResource {
    @RequestMapping("/hello")
    public String hello(){
        return  "Hello World!";
    }

}
