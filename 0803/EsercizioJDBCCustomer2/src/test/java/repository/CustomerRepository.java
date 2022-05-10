package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.lr.Customer;

import rowerMapper.CustomerRowMapper;

public class CustomerRepository {

	public void save(Customer x) {
		// TODO Auto-generated method stub
		
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Customer findByCustomerId(int id) {
		String query="SELECT * FROM CUSTOMER WHERE ID=?";
		
		return (Customer) jdbcTemplate.queryForObject(query,  new Object[] {id},new CustomerRowMapper());
	
	}

	
	public Customer findByCustomerId2(int id) {
		
		String query = "SELECT * FROM CUSTOMER WHERE ID=?";
		return(Customer) jdbcTemplate.queryForObject(query, new Object[]{id}, new BeanPropertyRowMapper(Customer.class));
	}
	
}
