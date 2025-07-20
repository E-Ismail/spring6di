package guru.springframework.spring6di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-di
 * @create 20/07/2025 - 22:09
 */

@SpringBootTest
//@ActiveProfiles("EN")
class Myi18ControllerENTest {

    @Autowired
    Myi18Controller myi18Controller;

    @Test
    void sayHello() {
        assertEquals("Hello World - EN", myi18Controller.sayHello());
    }
}