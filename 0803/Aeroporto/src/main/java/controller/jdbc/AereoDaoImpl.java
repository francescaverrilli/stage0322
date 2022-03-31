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
import model.Volo;

import java.util.ArrayList;
import java.util.List;


public class AereoDaoImpl implements GenericDao<Aereo> {
	
	private static AereoDaoImpl instance=new AereoDaoImpl();
	private AereoDaoImpl() {
		
	}
	public static AereoDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<Aereo> getAll() {
		List<Aereo> result=new ArrayList<Aereo>();
		
		try(Connection c=JdbcDaoFactory.getConnection(); Statement stm=c.createStatement()){
			
			String query="select * from aereo";
			ResultSet r =stm.executeQuery(query);
			while(r.next()) {
			int idAereo=r.getInt("aereo.idAereo");
			 String nome=r.getString("aereo.nome");
			 int numeroPosti=r.getInt("aereo.numeroPosti");
			 String tipo=r.getString("aereo.tipo");
			 
			 Aereo aereo=new Aereo(idAereo,nome,numeroPosti,tipo);
			 result.add(aereo);
			}				
		}catch(SQLException e){
		    e.printStackTrace();
		
		}
		return result;
		}

	@Override
	public Aereo getById(int id) {
			String query="select * from aereo where idAereo=?";
			try(Connection c=JdbcDaoFactory.getConnection(); PreparedStatement stm=c.prepareStatement(query)){
				stm.setInt(1, id);
				ResultSet r =stm.executeQuery();
				if(r.next()) {
				
				int idAereo=r.getInt("aereo.idAereo");
				 String nome=r.getString("aereo.nome");
				 int numeroPosti=r.getInt("aereo.numeroPosti");
				 String tipo=r.getString("aereo.tipo");
				 Aereo aereo=new Aereo(idAereo,nome,numeroPosti,tipo);
				return (aereo);
			}
				}catch(SQLException e){
					e.printStackTrace();
					}return null;
	}

	@Override
	public boolean insert(Aereo a) {
		
		
		
		String query ="insert into aereo(idAereo,nome,numeroPosti,tipo) values(?,?,?,?)";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
			ps.setInt(1, a.getIdAereo());
			ps.setString(2,a.getNome());
			ps.setInt(3,a.getNumeroPosti());
			ps.setString(4,a.getTipo());
			int r=ps.executeUpdate();
			return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Aereo a) {
		String query ="delete from aereo where idAereo=? and nome=? and numeroPosti=? and tipo=?";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
			
			ps.setInt(1, a.getIdAereo());
			ps.setString(2,a.getNome());
			ps.setInt(3,a.getNumeroPosti());
			ps.setString(4,a.getTipo());
			int r=ps.executeUpdate();
			
			return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean update(Aereo a) {
		String query ="update aereo set nome=? where idAereo=?";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
		ps.setString(1,a.getNome());
		ps.setInt(2,a.getIdAereo());
		int r=ps.executeUpdate();
		return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
		
	}

}
	
	

	