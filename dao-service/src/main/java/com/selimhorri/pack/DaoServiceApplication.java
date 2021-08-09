package com.selimhorri.pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DaoServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DaoServiceApplication.class, args);
	}
	
	
	
}
