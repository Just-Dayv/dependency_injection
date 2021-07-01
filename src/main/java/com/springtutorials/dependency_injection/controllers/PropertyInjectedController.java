package com.springtutorials.dependency_injection.controllers;

import com.springtutorials.dependency_injection.services.GreetingService;
import com.springtutorials.dependency_injection.services.PropertyGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
