package com.lr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"bean.xml"});
		//sigleton
		
		CustomerService custA = (CustomerService)context.getBean("customerServiceSingleton");
    	custA.setMessage("Messaggio da custA");
    	System.out.println("Message : " + custA.getMessage());
    	
    	CustomerService custB = (CustomerService)context.getBean("customerServiceSingleton");
    	System.out.println("Messagge : " + custB.getMessage());
    	
    	CustomerService custC = (CustomerService)context.getBean("customerServicePrototype");
    	custC.setMessage("messaggio da custC");
    	System.out.println("Messagge : " + custC.getMessage());
    	

    	
		
	}

}
