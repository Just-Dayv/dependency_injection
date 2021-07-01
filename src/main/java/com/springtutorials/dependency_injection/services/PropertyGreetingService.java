package com.springtutorials.dependency_injection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Greetings form Property Injector";
    }
}
