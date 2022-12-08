package com.microbeatlas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaxaServiceApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(TaxaServiceApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Taxa service running! ");
	}
}