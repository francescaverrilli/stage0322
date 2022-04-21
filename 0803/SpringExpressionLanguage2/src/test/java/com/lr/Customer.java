package com.lr;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {


	@Value("#{ItemBean}")
	private Item item;
	
	@Value("#{itemBean.name}")
	private String itemName;
	

}
