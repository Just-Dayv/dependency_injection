package com.springtutorials.dependency_injection.services;


import org.springframework.stereotype.Service;


public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from Constructor Injector" ;
    }
}
