package com.springtutorials.dependency_injection.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("English")
@Service("i18nService")
public class I18EnglishGreetingService implements  GreetingService{


    @Override
    public String sayGreeting() {
        return "Greetings from English Service";
    }
}
