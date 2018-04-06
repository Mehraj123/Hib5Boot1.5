package com.hib.config;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HinernateConfig {

	private StandardServiceRegistry standardServiceRegistry;
	private SessionFactory sessionFactory;

	@Bean
	public SessionFactory sessionFactory() {
		try {
			standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
			Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
			sessionFactory =  metadata.getSessionFactoryBuilder().build();
			return sessionFactory;
		} catch (Exception e) {
			System.out.println("Exception occured while creating SessionFactory");
			e.printStackTrace();
			if (standardServiceRegistry != null) {
				StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
			}
		}
		return sessionFactory;
	}
	
	@PostConstruct
	public void post() {
		System.out.println("SessionFactory Created");
	}

}
