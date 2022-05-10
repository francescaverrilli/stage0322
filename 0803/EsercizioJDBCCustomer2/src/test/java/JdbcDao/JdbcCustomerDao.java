package JdbcDao;

import java.sql.ResultSet;

import java.sql.SQLException;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.lr.Customer;



import InterfaceDao.CustomerDao;;


public class JdbcCustomerDao extends JdbcDaoSupport implements CustomerDao {

	
	
	//utlizzo di template per abbreviare il metodo della query insert
	
	@Override
	public void insert(Customer customer) {

		String query = "INSERT INTO CUSTOMER " + "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

		getJdbcTemplate().update(query, new Object[] { customer.getCustId(), customer.getName(), customer.getAge() });

	}

	@Override
	public Customer findById(int custId) {
		// TODO Auto-generated method stub
		return null;
	}




	/*@Override
	public Customer findById(int custId) {

		String query = "select * from customer where cust_id=?";
		
		
		
		Customer customer=getJdbcTemplate().query(query,new Object[] {customer.getCustId()});
		return customer;
		
	}*/
}
