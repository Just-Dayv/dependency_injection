package com.springtutorials.dependency_injection;

import com.springtutorials.dependency_injection.controllers.MyController;
import com.springtutorials.dependency_injection.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class  DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext context  = SpringApplication.run(DependencyInjectionApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");

        System.out.println(myController.getGreeting());

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

    }

}
