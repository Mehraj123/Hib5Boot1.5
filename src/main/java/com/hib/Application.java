package com.hib;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hib.entity.Person;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private EntityManagerFactory managerFactory;

	public Application(EntityManagerFactory managerFactory) {
		this.managerFactory = managerFactory;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		EntityManager entityManager = managerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Person person = new Person("Mehraj Malik");
		entityManager.persist(person);
		System.out.println("Saved!!");
		entityManager.close();
	}
}
