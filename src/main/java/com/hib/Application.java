package com.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hib.entity.Person;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private SessionFactory sessionFactory;

	public Application(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Person person = new Person("Mehraj Malik");
		session.save(person);
		System.out.println("Saved!!");
		session.getTransaction().commit();
		session.close();
	}
}
