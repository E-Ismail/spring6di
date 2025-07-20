package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-di
 * @create 20/07/2025 - 21:10
 */

class MyControllerTest {

    @Test
    void sayHello() {
        MyController controller = new MyController();
        System.out.println(controller.sayHello());
    }
}