package guru.springframework.spring6di.services;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-di
 * @create 22/07/2025 - 22:44
 */

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev","default"})
public class EnvironmentServiceDevImpl implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "dev";
    }
}
