package com.lr;

import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="stock", catalog="hibernate",uniqueConstraints= {
		@UniqueConstraint(columnNames="STOCK_NAME"),
		@UniqueConstraint(columnNames="STOCK_CODE") })    
public class Stock implements Serializable{
	
	private Integer stockId;
	private String stockCode;
	private String stockName;
	
	public Stock() {
		
	}
	
	public Stock(String stockCode,String stockName) {
		this.stockCode=stockCode;
		this.stockName=stockName;
		
	}
	
	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name = "STOCK_ID",unique=true,nullable=false)
	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	@Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	@Column(name = "STOCK_NAME", unique = true, nullable = false, length = 20)
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockCode=" + stockCode + ", stockName=" + stockName + "]";
	}
	
	

}
