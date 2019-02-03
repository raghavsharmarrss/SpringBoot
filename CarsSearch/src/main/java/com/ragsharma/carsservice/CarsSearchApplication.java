package com.ragsharma.carsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class CarsSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsSearchApplication.class, args);
	}

}

