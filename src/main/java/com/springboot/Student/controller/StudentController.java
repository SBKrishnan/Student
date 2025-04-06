package com.springboot.Student.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @GetMapping("/")
    public String hello(){
        return "Hello, World";
    }
}
