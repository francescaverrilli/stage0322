package com.lr;

import java.time.LocalDateTime;

public class Customer {
	int custId;
	String name;
	int age;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCreatedDate(LocalDateTime localDateTime) {
		// TODO Auto-generated method stub
		
	}
	
	
}
