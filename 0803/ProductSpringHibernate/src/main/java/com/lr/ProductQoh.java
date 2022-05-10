package com.lr;

import java.io.Serializable;

public class ProductQoh implements Serializable
{
	private Long qohId;
	private long productId;
	private int qty;
	
	
	public ProductQoh(Long qohId, long productId, int qty) {
		super();
		this.qohId = qohId;
		this.productId = productId;
		this.qty = qty;
	}
	
	public ProductQoh() {
		// TODO Auto-generated constructor stub
	}

	public Long getQohId() {
		return qohId;
	}
	public void setQohId(Long qohId) {
		this.qohId = qohId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	


}
