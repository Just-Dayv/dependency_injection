package com.springtutorials.dependency_injection.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Spanish")
@Service("i18nService")
public class I18SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greetings from Spanish service";
    }
}
