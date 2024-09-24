package com.booknow.registra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistraApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistraApplication.class, args);
	}

}
