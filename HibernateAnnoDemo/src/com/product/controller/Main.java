package com.product.controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.product.beans.Product;

public class Main
{
	public static void main(String[] args) 
	{
		
	SessionFactory sessionFactory = new AnnotationConfiguration().configure("Hibernate.cfg.xml").buildSessionFactory();
	
	Session session = sessionFactory.openSession();
	
	Transaction txn = session.beginTransaction();
	
	try {
	
		Product p = new Product();
		
		
		p.setName("Mobile");
		p.setPrice(40000);
		p.setDiscount(1000);
		System.out.println("record inserted successfully");
		
		session.save(p);
		txn.commit();
	}
	
	catch(HibernateException e)
	{
		txn.rollback();
		System.out.println("Exception while creating"+e);
		e.printStackTrace();
	}
	finally {
		session.close();
	}
	}

}
