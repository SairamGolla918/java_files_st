package com.spring.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.springdemo2.beans.Customer;
import com.spring.springdemo2.configg.AppBeansConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppBeansConfig.class);
        
        Customer c = container.getBean(Customer.class);
        System.out.println(c.getCustomerNo()+" "+c.getCustomerName()+" "+c.getMobileNo());
    	System.out.println(c.getCustomerAddress().getHno());
    	System.out.println(c.getCustomerAddress().getStreetName());
    	System.out.println(c.getCustomerAddress().getCity());
    	System.out.println(c.getCustomerAddress().getState());
    	container.close();
    }
}
