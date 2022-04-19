package com.lr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main( String[] args ){
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"bean.xml"});
	
	Customer cust=(Customer)context.getBean("CustomerBean");
	System.out.println(cust);
	
	Person px=(Person)context.getBean("PersonBean");
	System.out.println(px);
	
	

	}

}
