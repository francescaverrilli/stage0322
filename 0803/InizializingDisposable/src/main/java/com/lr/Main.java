package com.lr;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"Bean.xml"});
		
	    	CustomerService cust = (CustomerService)context.getBean("customerService");
	    	
	    	System.out.println(cust);
	    	
	    	context.close();

	}

}
