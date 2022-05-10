package com.lr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bo.ProductBo;

public class Main {

	public static void main(String[] args) {
    	ApplicationContext appContext = 
        		new ClassPathXmlApplicationContext("spring/config/Beanlocation.xml");
    	
        	Product product = new Product(null, null, null);
        	product.setProductCode("ABC");
        	product.setProductDesc("This is product ABC");
        	
        	ProductBo productBo = (ProductBo)appContext.getBean("productBoProxy");
        	productBo.save(product, 100);
        	
        	
        }
    

	

}
