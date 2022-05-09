package dao.impl;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.lr.model.Person;

import dao.PersonDao;

public class PersonDaoImpl implements PersonDao{
	
	private SessionFactory sessionFactory; 


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Person p) {
		Session session=this.sessionFactory.openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
		
	}

	@Override
	public List<Person> list() {
		
		Session session =this.sessionFactory.openSession();
		List<Person> personList=session.createQuery("from Person").list();
		session.close();
		
		return personList;
	}

	
}
