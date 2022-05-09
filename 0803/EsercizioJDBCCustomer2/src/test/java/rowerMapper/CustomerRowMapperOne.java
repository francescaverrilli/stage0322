package rowerMapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.lr.Customer;

public class CustomerRowMapperOne implements org.springframework.jdbc.core.RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

		Customer customer = new Customer();
		customer.setCustId(rs.getInt("ID"));
		customer.setName(rs.getString("NAME"));
		customer.setAge(rs.getInt("AGE"));
		customer.setCreatedDate(rs.getTimestamp("created_date").toLocalDateTime());

		return customer;
	}
	
	

}
