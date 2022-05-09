package bo;

import java.util.List;

import model.Customer;

public interface CustomerBo {
	void addCustomer(Customer customer);
	List<Customer> findAllCustomer();

}
