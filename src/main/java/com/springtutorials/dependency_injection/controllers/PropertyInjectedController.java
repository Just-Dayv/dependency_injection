package com.springtutorials.dependency_injection.controllers;

import com.springtutorials.dependency_injection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
