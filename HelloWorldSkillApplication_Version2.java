import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldSkillApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSkillApplication.class, args);
    }
}

@RestController
class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
}