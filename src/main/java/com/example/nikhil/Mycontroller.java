package com.example.nikhil;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Mycontroller {
    @GetMapping("/")
    public String hello(){
        return "Hello, world!";
    }
}
