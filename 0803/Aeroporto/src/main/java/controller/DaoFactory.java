package controller;

import controller.jdbc.JdbcDaoFactory;
import dao.GenericDao;
import model.*;

public abstract class DaoFactory {
	
	public abstract GenericDao<Aeroporto> getAeroportoDao();
	
	public abstract GenericDao<Volo> getVoloDao();
	
	public abstract GenericDao<Aereo> getAereoDao();
	
	public static DaoFactory getDaoFactory() {
		return new JdbcDaoFactory();
	}

}
