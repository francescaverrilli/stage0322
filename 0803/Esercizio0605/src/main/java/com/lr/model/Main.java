package com.lr.model;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import dao.PersonDao;

public class Main {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("SpringBean.xml");
		
		PersonDao personDao=context.getBean(PersonDao.class);
		
		Person person=new Person();
		person.setName("Luca");
		person.setCountry("Teano");
		
		personDao.save(person);
		System.out.println("Person : "+person);
		List<Person>list=personDao.list();
		
		for(Person p:list) {
			System.out.println("Person list: "+p);
			
			context.close();
		}

	}

}
