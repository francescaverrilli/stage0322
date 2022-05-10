package dao;

import java.util.List;

import com.lr.model.Person;

public interface PersonDao {

	public void save(Person p);
	public List<Person> list();
}
