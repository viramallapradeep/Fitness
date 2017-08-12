package com.honeywell.Fitnessapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan("com.honeywell.Fitnessapp.*")
public class FitnessappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessappApplication.class, args);
	}

}
