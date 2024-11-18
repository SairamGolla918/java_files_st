package com.spring.springdemo2.configg;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.springdemo2.beans.Address;
import com.spring.springdemo2.beans.Customer;

@Configuration
@ComponentScan(basePackages="com.spring.springdemo2")
public class AppBeansConfig 
{
//	@Bean
//	public Address address() 
//	{
//		return new Address("9-8-8","Sri Ram Nagar","Kurnool","AP");
//	}
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//	public Customer customer()
//	{
//		return new Customer(9081,"Saiee Yadav",898988453L,address());
//	}
	public Customer customer() {
		Customer c = new Customer();
		
		c.setCustomerNo(8001);
		c.setCustomerName("Saiee Yadav");
		c.setMobileNo(9542427704L);
		//c.setCustomerAddress(address());
		return c;
	}
	
}
