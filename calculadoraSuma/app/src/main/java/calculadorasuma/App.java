package calculadorasuma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @GetMapping("/")
    public float home(@RequestParam float a1, @RequestParam float a2) {
        return  a1 + a2;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(8081); // Cambia el puerto aquí
    }
}