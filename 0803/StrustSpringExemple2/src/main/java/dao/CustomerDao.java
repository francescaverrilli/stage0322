package dao;

import java.util.List;

import model.Customer;

public interface CustomerDao {

	void addCustomer(Customer customer);
	
	List<Customer> findAllCustomer();
}
