package com.lr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
public class Item {
	
	
	private String name;
	
	private int qty;
	
	public String getName() {
		return name;
	}

}
