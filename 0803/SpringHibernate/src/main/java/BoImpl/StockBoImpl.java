package BoImpl;

import model.StockDao;
import stock.Stock;

public class StockBoImpl implements StockBo{
	
	 StockDao stockDao;

	public void setStockDao(StockDao stockDao) {
		
		this.stockDao=stockDao;
	}
	

	@Override
	public void save(Stock stock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Stock stock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Stock stock) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Stock findByStockCode(String stockCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
