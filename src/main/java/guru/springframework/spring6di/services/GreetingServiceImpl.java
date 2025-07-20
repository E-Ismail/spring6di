package guru.springframework.spring6di.services;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-di
 * @create 20/07/2025 - 21:09
 */

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service!!!";
    }
}
