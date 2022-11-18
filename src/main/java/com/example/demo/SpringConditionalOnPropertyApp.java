package com.example.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringConditionalOnPropertyApp implements CommandLineRunner {

	private List<Services> services;

	public SpringConditionalOnPropertyApp(List<Services> services) {
		this.services = services;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringConditionalOnPropertyApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		services.stream().forEach(Services::fala);

	}

}
