package com.microbeatlas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SamplesServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(SamplesServiceApplication.class, args);
	}

}