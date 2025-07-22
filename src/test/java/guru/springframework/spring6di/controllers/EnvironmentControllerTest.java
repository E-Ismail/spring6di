package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-di
 * @create 22/07/2025 - 22:47
 */

@ActiveProfiles({"prod","EN"})
@SpringBootTest
class EnvironmentControllerTest {

    @Autowired
    EnvironmentController environmentController;

    @Test
    void getEnvironment() {

        assertEquals("You are in dev Environment",environmentController.getEnvironment());
    }
}