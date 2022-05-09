package bo.impl;

import java.util.List;

import bo.CustomerBo;
import dao.CustomerDao;
import model.Customer;

public class CustomerBoImpl implements CustomerBo{
	
	CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao=customerDao;
	}

	@Override
	public void addCustomer(Customer customer) {
		
		customerDao.addCustomer(customer);
		
	}

	@Override
	public List<Customer> findAllCustomer() {
	
		return customerDao.findAllCustomer();
	}
	

}
