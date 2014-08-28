package com.hibernate.main;

import com.hibernate.config.HibernateConfig;
import com.hibernate.model.Address;
import com.hibernate.model.UserDetails;
import com.hibernate.service.UserServiceImpl;

public class HibernateEmbeddedMain {

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setAddressLine("150ft Ring  Road");
		address.setCity("Rajkot");
		address.setState("Gujarat");
		
		UserDetails userDetails = new UserDetails();
		userDetails.setFirstName("Saurabh");
		userDetails.setLastName("Sejpal");
		userDetails.setAddress(address);
		
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		boolean userStatus = userServiceImpl.addUser(userDetails);
		if(userStatus){
			System.out.println("User Added Successfully");
		}
		else {
			System.out.println("Something went wrong");
		}
		/* closing the Hibernate SessionFactory */
		HibernateConfig.getSessionFactory().close();
		
	}

}
