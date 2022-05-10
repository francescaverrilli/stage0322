package com.lr;

import java.io.Serializable;

public class Product implements Serializable{
	
	private Long productId;
	private String productCode;
	private String productDesc;
	public Product(Long productId, String productCode, String productDesc) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productDesc = productDesc;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	
	

}
