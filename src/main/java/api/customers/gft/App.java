package api.customers.gft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Auto configuracion de SpringBootApplication
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {
		"api.customers.gft", 
		"api.customers.gft.controllers.*",
		"api.customers.gft.services.*"
		})
public class App {
	
    public static void main( String[] args ){
    	SpringApplication.run(App.class, args);
    }
}
