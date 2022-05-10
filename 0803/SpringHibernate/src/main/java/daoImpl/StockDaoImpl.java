package daoImpl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import antlr.collections.List;
import model.StockDao;
import stock.Stock;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao{

	@Override
	public void save(Stock stock) {
		getHibernateTemplate().save(stock);
	}

	@Override
	public void update(Stock stock) {
		getHibernateTemplate().update(stock);		
	}

	@Override
	public void delete(Stock stock) {
		getHibernateTemplate().delete(stock);
		
	}

	@Override
	public Stock findByStockCode(String stockCode) {

		List list =(List) getHibernateTemplate().find("from Stock where stockCode=?",stockCode);
		
		return (Stock)((java.util.List) list).get(0);
	}
	

}
