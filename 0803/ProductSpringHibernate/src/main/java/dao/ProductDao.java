package dao;

import org.springframework.beans.support.PagedListSourceProvider;

import com.lr.Product;

public interface ProductDao {
	
	void save(Product product);

}
