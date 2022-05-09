package InterfaceDao;

import com.lr.Customer;

public interface CustomerDao {
	
	public void insert(Customer customer);
	public Customer findById(int custId);

}
