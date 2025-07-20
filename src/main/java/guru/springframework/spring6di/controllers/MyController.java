package guru.springframework.spring6di.controllers;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-di
 * @create 20/07/2025 - 20:43
 */

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("I am in the controller");
        return "Hello Everyone";
    }
}
