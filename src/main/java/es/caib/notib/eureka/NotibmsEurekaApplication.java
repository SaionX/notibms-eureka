package es.caib.notib.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NotibmsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotibmsEurekaApplication.class, args);
	}

}
