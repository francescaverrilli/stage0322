package com.lr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
public class Item {
	
	@Value("OggettoA")
	private String name;
	
	@Value("20")
	private int qly;
	
	
	public String getName() {
		return name;
	}
	

}
