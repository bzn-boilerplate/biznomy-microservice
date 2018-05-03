package com.biznomy.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BiznomyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiznomyConfigServerApplication.class, args);
	}
}
