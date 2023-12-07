package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.models"})
@Configuration
@ComponentScan({"com.example.services", "com.example.repositories", "com.example.controller"})
@EnableJpaRepositories("com.example.repositories")

public class Tutoria02Application {

	public static void main(String[] args) {
		SpringApplication.run(Tutoria02Application.class, args);
	}

}
