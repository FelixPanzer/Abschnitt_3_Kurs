package felix.springframework.spring6di.controllers;

import static org.junit.jupiter.api.Assertions.*;

import felix.springframework.spring6di.services.GreetingServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest
{
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp()
    {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void sayHello()
    {
        System.out.println(controller.sayHello());
    }
}