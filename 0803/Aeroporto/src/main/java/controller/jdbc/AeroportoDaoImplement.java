package controller.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.AeroportoDao;
import dao.GenericDao;
import model.Aeroporto;
import model.Volo;

public class AeroportoDaoImplement implements GenericDao<Aeroporto> {
	
	private static AeroportoDaoImplement instance=new AeroportoDaoImplement();
	private AeroportoDaoImplement() {
		
	}
	public static AeroportoDaoImplement getInstance() {
		return instance;
	}
	
	@Override
	public List<Aeroporto> getAll() {
		List<Aeroporto> result=new ArrayList<Aeroporto>();
		
		try(Connection c=JdbcDaoFactory.getConnection(); Statement stm=c.createStatement()){

				String query="select * from aerporto";
				ResultSet r =stm.executeQuery(query);
				
				int idAeroporto=r.getInt("aeroporto.idAeroporto");
				String citta=r.getString("aeroporto.citta");
				String nome=r.getString("aeroporto.nome");
				String nazione=r.getString("aeroporto.nazione");
				int numeroPiste=r.getInt("aeroporto.numeroPiste");
				
				Aeroporto aeroporto=new Aeroporto(idAeroporto, citta, nazione, nome, numeroPiste);
				
				
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public Aeroporto getById(int id) {
		String query="select * from aeroporto where id=?";
		try(Connection c=JdbcDaoFactory.getConnection(); PreparedStatement stm=c.prepareStatement(query)){
			stm.setInt(1, 1);
			ResultSet r =stm.executeQuery();
			
			int idAeroporto=r.getInt("aeroporto.idAeroporto");
			String citta=r.getString("aeroporto.citta");
			String nome=r.getString("aeroporto.nome");
			String nazione=r.getString("aeroporto.nazione");
			int numeroPiste=r.getInt("aeroporto.numeroPiste");
			
			Aeroporto aeroporto=new Aeroporto(idAeroporto, citta, nazione, nome, numeroPiste);
			return (aeroporto);
			}catch(SQLException e){
				e.printStackTrace();
				} return null ;
	}

	@Override
	public boolean insert(Aeroporto a) {
		String query ="insert into aeroporto(citta,nome,nazione,numeroPiste,) values(?,?,?,?)";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
			ps.setString(1,"citta");
			ps.setString(2,"");
			ps.setString(3,"");
			ps.setInt(4,1);
			int r=ps.executeUpdate();
			return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Aeroporto a) {
		String query ="delete * from aeroporto where id=?";

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
	public boolean update(Aeroporto a) {
			String query ="update aeroporto set nome=? where id=?";

			try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
			ps.setString(1,"");
			ps.setInt(2,1);
			int r=ps.executeUpdate();
			return r==1;
			}catch (SQLException e){
			e.printStackTrace();
			}
			return false;
		
	}
	

	

}
