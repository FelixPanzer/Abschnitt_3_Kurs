package felix.springframework.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import felix.springframework.spring6di.services.GreetingServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest
{
PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp()
    {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello()
    {
        System.out.println(propertyInjectedController.sayHello());
    }
}