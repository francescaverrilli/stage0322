package dao.ilmp;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.CustomerDao;
import model.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{

	@Override
	public void addCustomer(Customer customer) {
		 customer.setCreatedDate(new Date());
		 getHibernateTemplate().save(customer);
		
	}

	@Override
	public List<Customer> findAllCustomer() {
		
		return getHibernateTemplate().find("from Customer");
	}

}
