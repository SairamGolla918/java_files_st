package com.product.controller;

import java.util.*;



import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.product.beans.Product;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product Id");
		int id = sc.nextInt();
		System.out.println("Enter the Product Name");
		String name=sc.next();
		System.out.println("Enter the Product Price");
		double price = sc.nextDouble();
		System.out.println("Enter the Discount");
		double discount = sc.nextDouble();
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Product p = new Product();
		p.setProductId(id);
		p.setProductName(name);
		p.setProductPrice(price);
		p.setDiscount(discount);
		
		System.out.println("Record inserted successfully");
		
		session.save(p);
		tx.commit();
		
		session.close();
		factory.close();
		
		
	}

}
