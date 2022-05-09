package model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable{
	
	private long customerId;
	private String name;
	private String address;
	private Date createdDate;
	
	
	
	public Customer(long customerId, String name, String address, Date createdDate) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.createdDate = createdDate;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	

	
}
