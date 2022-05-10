package rowerMapper;


import java.sql.ResultSet;

import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.JdbcTemplate;

import com.lr.Customer;
import com.mysql.cj.result.Row;
import com.mysql.cj.result.ValueFactory;

public class CustomerRowMapper  implements org.springframework.jdbc.core.RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		Customer customer=new Customer(null, rowNum);
		customer.setCustId(rs.getInt("id"));
		customer.setName(rs.getString("name"));
		customer.setAge(rs.getInt("age"));
		
		customer.setCreatedDate(rs.getTimestamp("created_date").toLocalDateTime());
		return customer;
	}
	
	private JdbcTemplate jdbcTemplate;
	
	public Customer findByCustomer(int id) {
		String query="select *from customer where id=?";
		
		return (Customer) jdbcTemplate.queryForObject(query, new Object[] {id},new CustomerRowMapper());
	}



}
