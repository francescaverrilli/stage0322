package com.lr;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomerService implements InitializingBean, DisposableBean {
	
	String message;
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inizializzazione dopo aver impostato le proprieta");
		
	}
	@Override
	public void destroy() throws Exception {
	System.out.println("distruzione spring container");
		
	}



}
