package com.springtutorials.dependency_injection.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class   MyController {

    public String sayHello(){
        System.out.println("Hi World");
        return "Hello World";
    }
}