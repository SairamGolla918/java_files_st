package com.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.beans.Product;

public class Client{
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		Product product = new Product();
		
		product.setProductId(1);
		product.setProductName("Mobile");
		product.setProductPrice(900000.00);
		
		em.persist(product);
		em.getTransaction().commit();
		
		System.out.println("Record done");
		em.close();
		factory.close();
		
		
	}

}
