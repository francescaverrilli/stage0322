package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lr.ProductQoh;

import dao.ProductQohDao;

public class ProductQohDaoImpl extends HibernateDaoSupport implements ProductQohDao

{

	@Override
	public void save(ProductQoh productQoh) {
		getHibernateTemplate().save(productQoh);
	}

}
