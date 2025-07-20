package guru.springframework.spring6di.controllers;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-di
 * @create 20/07/2025 - 21:22
 */

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
