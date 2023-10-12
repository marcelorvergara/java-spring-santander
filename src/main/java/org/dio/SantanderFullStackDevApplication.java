package org.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "org.dio")
public class SantanderFullStackDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderFullStackDevApplication.class, args);
	}

}
