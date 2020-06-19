package nl.deruiterautomatisering.myapp.cucumber;

import io.cucumber.java.Before;
import nl.deruiterautomatisering.myapp.JhipsterSampleApplicationApp;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
@ContextConfiguration(classes = JhipsterSampleApplicationApp.class)
public class CucumberContextConfiguration {

    @Before
    public void setup_cucumber_spring_context() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }
}
