package main.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootHome {

	@RequestMapping("/")
    String home() {
		System.out.println("Hello world");
        return "Hello World!";
    }
	
	@RequestMapping("/AirlineService")
    RedirectView getIndexPage() {
		System.out.println("index page");
        return new RedirectView("index.jsp");
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHome.class, args);
	}
}
