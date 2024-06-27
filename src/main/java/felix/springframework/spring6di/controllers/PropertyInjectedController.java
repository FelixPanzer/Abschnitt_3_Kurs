package felix.springframework.spring6di.controllers;

import felix.springframework.spring6di.services.GreetingService;

public class PropertyInjectedController
{
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
