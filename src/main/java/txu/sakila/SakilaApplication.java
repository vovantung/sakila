package txu.sakila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SakilaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SakilaApplication.class, args);
    }

}
