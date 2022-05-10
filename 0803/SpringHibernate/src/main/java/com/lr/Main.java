package com.lr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BoImpl.StockBo;
import stock.Stock;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/BeanLocation.xml");
		
		StockBo stockBo= (StockBo)applicationContext.getBean("stockBo");
		
		/** insert **/
		
		Stock stock=new Stock();
		stock.setStockCode("9876");
		stock.setStockName("scortaTipo1");
		stockBo.save(stock);
		
		/** select **/
		Stock stock2=stockBo.findByStockCode("9876"); 
		System.out.println(stock2);
		
		
	}

}
