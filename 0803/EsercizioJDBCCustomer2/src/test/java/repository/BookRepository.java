package repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import java.awt.print.Book;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookRepository {
	
	private Object jdbcTemplate;

	public int [] batchInsert(List<Book> books) {
		return ( (JdbcTemplate) this.jdbcTemplate).batchUpdate("insert into books (name, price) values(?,?)",
				new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setString(1, books.get(i).getName());
				ps.setBigDecimal(2, books.get(i).getPrice());
			}

			public int getBatchSize() {
				return books.size();
			}

			
		});
	}
	public int [] batchUpdate(List<Book> books) {
		return this.jdbcTemplate.betchUpdate(
				"update books set price=? where id=?",new BatchPreparedStatementSetter() {
					public void setValues(PreparedStatement ps,int i)
					throws SQLException {
                        ps.setBigDecimal(1, books.get(i).getPrice());
                        ps.setLong(2, books.get(i).getId());
                    }

					@Override
					public int getBatchSize() {
						// TODO Auto-generated method stub
						return books.size();
					}
				} );
		
		
	}
	
}
