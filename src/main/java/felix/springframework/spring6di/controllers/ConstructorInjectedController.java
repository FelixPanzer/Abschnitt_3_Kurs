package felix.springframework.spring6di.controllers;

import felix.springframework.spring6di.services.GreetingService;

public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    public ConstructorInjectedController(final GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
