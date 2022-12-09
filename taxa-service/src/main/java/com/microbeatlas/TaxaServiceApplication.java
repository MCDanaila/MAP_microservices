package com.microbeatlas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TaxaServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(TaxaServiceApplication.class, args);
	}
}