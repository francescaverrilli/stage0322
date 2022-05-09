package com.lr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
		           new ClassPathXmlApplicationContext("Spring-Mail.xml");
		
		MailMail mm = (MailMail) context.getBean("mailMail");
        mm.sendMail("Luca", "questo è un messaggio per te");

	}

}
