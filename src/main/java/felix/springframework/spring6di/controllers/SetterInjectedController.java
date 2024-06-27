package felix.springframework.spring6di.controllers;

import felix.springframework.spring6di.services.GreetingService;

public class SetterInjectedController
{
    private GreetingService greetingService;

    public void setGreetingService(final GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
