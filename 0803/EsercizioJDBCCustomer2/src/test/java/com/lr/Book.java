package com.lr;

public class Book {
	
	int Id;
	String name;
	int price;
	
	
	
	public Book(int bookId, String name, int price) {
		super();
		this.Id = bookId;
		this.name = name;
		this.price = price;
	}
	
	public int getBookId() {
		return Id;
	}
	public void setBookId(int bookId) {
		this.Id = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
