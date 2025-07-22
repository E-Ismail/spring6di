package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
 * @author Ech-Cherrate Ismail
 * @project spring-6-di
 * @create 22/07/2025 - 22:54
 */
@Service
@Profile({"uat"})
public class EnvironmentServiceUATImpl implements EnvironmentService {
    @Override
    public String getEnvironment() {
        return "uat";
    }
}
