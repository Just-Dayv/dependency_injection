package com.springtutorials.dependency_injection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements  GreetingService{


    @Override
    public String sayGreeting() {
        return "Greetings from Primary Service";
    }
}
