package com.lr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {

		new ClassPathXmlApplicationContext("Spring-quartz.xml");

	}

}
