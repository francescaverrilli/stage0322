package stock;

import java.io.Serializable;

public class Stock implements Serializable{

	private static final long serialVersionUID = 1L; 
	
	private Long stockId;
	private String stockCode;
	private String stockName;
	
	
	
	public Stock() {
		super();
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockName = stockName;
	}
	public Long getStockIs() {
		return stockId;
	}
	public void setStockIs(Long stockIs) {
		this.stockId = stockIs;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
