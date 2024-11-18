package com.spring.springdemo.help;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor
{
	public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException
	{
		//System.out.println("from BPP PPBI method");
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean,String beanName) throws BeansException
	{
		//System.out.println("from BPP PPAI method");
		return bean;
	}
}
