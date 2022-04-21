package com.lr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import date.CustomerDate;
import map.CustomerMap;
import set.CustomerSet;

public class Main {

	public static void main(String[] args) {
		
			ApplicationContext context = new ClassPathXmlApplicationContext(
					"SpringBean.xml");

			/*Customer cust = (Customer) context.getBean("CustomerBean");
			System.out.println(cust);*/
			
			
			/*CustomerSet custSet = (CustomerSet) context.getBean("CustomerBeanSet");
			System.out.println(custSet);*/
			
			/*CustomerMap custMap = (CustomerMap) context.getBean("CustomerBeanMap");
			System.out.println(custMap);*/
			
			CustomerDate custDate = (CustomerDate) context.getBean("customer");
			System.out.println(custDate);
			
	}

}
