package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lr.Product;

import dao.ProductDao;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {

	@Override
	public void save(Product product) {
		getHibernateTemplate().save(product);
		
	}

}
