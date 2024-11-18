package com.spring.springdemo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Wish implements InitializingBean,DisposableBean
{
	
	
	private String message;
	private Wish() {}
//	public Wish() {
//		System.out.println("From Default Constructor");
//	}
	public static Wish createWishObject()
	{
		System.out.println("from createWishObject()");
		return new Wish();
	}
	public Wish(String message) {
		this.message = message;
	}
	
	public void setMessage(String message) {
		this.message = message;
		System.out.println("From setMessage()");
	}
	public String getMessage() {
		return message;
	}
	
	public void initWish()
	{
		System.out.println("From init Method");
	}
	
	public void destroyWsih() {
		System.out.println("From destroy Method");
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("From destroy");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("From APS");
		
	}

}
