package com.lr;

public class Customer {
	
	private Person person;

	public Customer(Person person) {
		super();
		this.person = person;
	}
	
	
	public void setPerson(Person person) {
		this.person = person;
	}


	@Override
	public String toString() {
		
		return "Customer[person=" + person + "]";
	}
	
	
	
}
