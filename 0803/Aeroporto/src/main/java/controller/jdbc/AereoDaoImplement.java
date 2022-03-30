package controller.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import dao.GenericDao;
import model.Aereo;
import model.Aeroporto;

import java.util.List;


public class AereoDaoImplement implements GenericDao<Aereo> {
	
	private static AereoDaoImplement instance=new AereoDaoImplement();
	private AereoDaoImplement() {
		
	}
	public static AereoDaoImplement getInstance() {
		return instance;
	}

	@Override
	public List<Aereo> getAll() {
		try(Connection c=JdbcDaoFactory.getConnection(); Statement stm=c.createStatement()){

			String query="select * from aereo";
			ResultSet r =stm.executeQuery(query);
			
			int idAereo=r.getInt("aereo.idAereo");
			 String nome=r.getString("aereo.nome");
			 int numeroPosti=r.getInt("aereo.numeroPosti");
			 String tipo=r.getString("aereo.tipo");
			 
			 Aereo aereo=new Aereo(idAereo,nome,numeroPosti,tipo);
				}catch(SQLException e){
		e.printStackTrace();
		}
		return null;
		}

	@Override
	public Aereo getById(int id) {
			String query="selecr * from aereo where id=?";
			try(Connection c=JdbcDaoFactory.getConnection(); PreparedStatement stm=c.prepareStatement(query)){
				stm.setInt(1, id);
				ResultSet r =stm.executeQuery();
				
				int idAereo=r.getInt("aereo.idAereo");
				 String nome=r.getString("aereo.nome");
				 int numeroPosti=r.getInt("aereo.numeroPosti");
				 String tipo=r.getString("aereo.tipo");
				 Aereo aereo=new Aereo(idAereo,nome,numeroPosti,tipo);
				return (aereo);
				}catch(SQLException e){
					e.printStackTrace();
					}return null;
	}

	@Override
	public boolean insert(Aereo a) {
		
		
		
		String query ="insert into aereo(nome,numeroPosti,tipo) values(?,?,?)";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
			ps.setString(1,"");
			ps.setString(2,"");
			ps.setString(3,"");
			int r=ps.executeUpdate();
			return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Aereo a) {
		String query ="delete * from aeroporto where id=(?)";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
			ps.setInt(1,1);
			int r=ps.executeUpdate();
			return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean update(Aereo a) {
		String query ="update aeroporto set nome=? where id=?";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
		ps.setString(1,"");
		ps.setInt(1,1);
		int r=ps.executeUpdate();
		return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
		
	}

}
	
	

	