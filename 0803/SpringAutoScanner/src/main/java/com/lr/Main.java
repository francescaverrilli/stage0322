package com.lr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Beans.xml"});

		    	CustomerService cust = (CustomerService)context.getBean("customerService");
		    	System.out.println(cust);

	}

}
