package com.spring.springdemo;

import com.spring.springdemo.beans.*;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springdemo.beans.Wish;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
    	//State s = container.getBean("st1",State.class);
//    	State s = (State) container.getBean("st1");
//    	
//    	System.out.println(s.getStateName()+"  "+s.getCountryName());
//    	
//    	for(Map.Entry<String,String> c : s.getCities().entrySet())
//    		System.out.println(c.getKey()+" "+c.getValue());
    	
//    	Wish w = container.getBean("wish1",Wish.class);
//    	System.out.println(w.getMessage());
//    	Wish w1 = container.getBean("wish1",Wish.class);
//    	Wish w2 = container.getBean("wish1",Wish.class);
//    	System.out.println(w1.getMessage());
//    	System.out.println(w2.getMessage());
//    	w2.setMessage("New Message");
//    	System.out.println(w1.getMessage());
//    	System.out.println(w2.getMessage());
//    	System.out.println( "Hello World!" );
    	
    	Customer c = container.getBean(Customer.class);
    	System.out.println(c.getCustomerNo()+" "+c.getCustomerName()+" "+c.getMobileNo());
    	System.out.println(c.getCustomerAddress().getHno());
    	System.out.println(c.getCustomerAddress().getStreetName());
    	System.out.println(c.getCustomerAddress().getCity());
    	System.out.println(c.getCustomerAddress().getState());
    	container.close();
    	
    
        
    }
}
