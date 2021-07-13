package com.springtutorials.dependency_injection.config;

import com.springtutorials.dependency_injection.services.ConstructorGreetingService;
import com.springtutorials.dependency_injection.services.PropertyGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyGreetingService propertyGreetingService(){
        return new PropertyGreetingService();
    }
}
