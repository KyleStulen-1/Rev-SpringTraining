package rev.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "INPUT PACKAGE WHERE BEAN CLASSES ARE")
public class AppConfig {

    @Bean
    public StudentServiceImpl studentService() {
        return new StudentServiceImpl();
    }

    @Bean
    public StudentController studentController(StudentService studentService) {
        return new StudentController(studentService);
    }
}