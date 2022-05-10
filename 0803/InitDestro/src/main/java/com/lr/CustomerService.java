package com.lr;

public class CustomerService {
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void initIt() throws Exception{
		
		System.out.println("Init dopo aver impostato le proprieta'  "+ message);
	}
	
	public void cleanUp() throws Exception{
		System.out.println("Il contenitore Spring è distrutto");
	}
	

}
