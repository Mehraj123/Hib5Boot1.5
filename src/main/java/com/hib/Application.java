package com.hib;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application{

	private EntityManagerFactory managerFactory;

	public Application(EntityManagerFactory managerFactory) {
		this.managerFactory = managerFactory;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
