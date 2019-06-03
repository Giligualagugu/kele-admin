package com.example.kele;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableAdminServer
@SpringBootApplication
public class KeleAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeleAdminApplication.class, args);
	}

}
