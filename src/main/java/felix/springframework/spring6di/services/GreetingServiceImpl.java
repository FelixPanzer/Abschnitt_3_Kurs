package felix.springframework.spring6di.services;

public class GreetingServiceImpl implements GreetingService
{
    public GreetingServiceImpl()
    {
    }

    @Override
    public String sayGreeting()
    {


        return "Hello Everyone from Base Service!!!"; //das von Greeting Service wird zuerst ausgedruckt und dann die
        // Implemntation hier im GSImpl
    }
}
