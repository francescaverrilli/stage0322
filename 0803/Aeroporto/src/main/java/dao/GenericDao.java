package dao;

import java.util.List;

import model.Aeroporto;

public interface GenericDao <B>{
	
	List<B> getAll();
	
	B getById(int id);
	boolean insert(B a);
	boolean delete(B a);
	boolean update(B a);
	

}
