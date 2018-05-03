package com.biznomy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BiznomyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiznomyEurekaServerApplication.class, args);
	}
}
