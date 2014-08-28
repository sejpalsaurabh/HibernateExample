package com.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/* SessionFactory Creation using Hibernate 4.3.6.Final Configuration */
public class HibernateConfig {

	private static SessionFactory sessionFactory = buildSessionFactory();

	/*
	 * This method shows the Hibernate 4.3.6.Final way to Create SessionFactory
	 * Object
	 */
	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
