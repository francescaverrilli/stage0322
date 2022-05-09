package com.lr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-mail.xml");
		
		MailMail mm=(MailMail) context.getBean("mailMail");
		
		mm.sendMail("riannaluca6@gmail.com", "lucarianna6@gmail.com", "prova Mail", "ciao Luca sono Luca");
		
	}

}
