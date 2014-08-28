package com.hibernate.service;

import org.hibernate.Session;

import com.hibernate.config.HibernateConfig;
import com.hibernate.model.UserDetails;

public class UserServiceImpl {
	
	
	public boolean addUser(UserDetails userDetails) {
		
		Session session = HibernateConfig.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(userDetails);
			session.getTransaction().commit();
			session.close();
			return true;
		}
		catch (Exception exception) {
			return false;
		}		
	}
	
}
