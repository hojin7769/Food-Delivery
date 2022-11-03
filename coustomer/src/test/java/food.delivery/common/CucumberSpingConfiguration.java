package food.delivery.common;


import food.delivery.CoustomerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CoustomerApplication.class })
public class CucumberSpingConfiguration {
    
}
