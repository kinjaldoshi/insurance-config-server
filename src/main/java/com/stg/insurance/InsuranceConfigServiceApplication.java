package com.stg.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class InsuranceConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceConfigServiceApplication.class, args);
	}
}
