package controller.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import controller.DaoFactory;
import dao.GenericDao;
import model.Aereo;
import model.Aeroporto;
import model.Volo;

public class JdbcDaoFactory extends DaoFactory{

	@Override
	public GenericDao<Aeroporto> getAeroportoDao() {
		return AeroportoDaoImpl.getInstance();
	}

	@Override
	public GenericDao<Volo> getVoloDao() {
		return VoloDaoImpl.getInstance();
		
	}

	@Override
	public GenericDao<Aereo> getAereoDao() {
		// TODO Auto-generated method stub
		return AereoDaoImpl.getInstance();
	}
	
	static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/esercizioaeroporto","root","Soprasteria2022!");
	}
	
	

}
