package controller.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import dao.GenericDao;
import model.Aeroporto;
import model.Volo;

public class AeroportoDaoImpl implements GenericDao<Aeroporto> {
	
	private static AeroportoDaoImpl instance=new AeroportoDaoImpl();
	private AeroportoDaoImpl() {
		
	}
	public static AeroportoDaoImpl getInstance() {
		return instance;
	}
	
	@Override
	public List<Aeroporto> getAll() {
		List<Aeroporto> result=new ArrayList<Aeroporto>();
		
		try(Connection c=JdbcDaoFactory.getConnection(); Statement stm=c.createStatement()){

				String query="select * from aerporto";
				ResultSet r =stm.executeQuery(query);
				while(r.next()) {
				int idAeroporto=r.getInt("aeroporto.idAeroporto");
				String citta=r.getString("aeroporto.citta");
				String nome=r.getString("aeroporto.nome");
				String nazione=r.getString("aeroporto.nazione");
				int numeroPiste=r.getInt("aeroporto.numeroPiste");
				
				Aeroporto aeroporto=new Aeroporto(idAeroporto, citta, nazione, nome, numeroPiste);
				result.add(aeroporto);
				}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
		
	}

	@Override
	public Aeroporto getById(int id) {
		String query="select * from aeroporto where idAeroporto=?";
		try(Connection c=JdbcDaoFactory.getConnection(); PreparedStatement stm=c.prepareStatement(query)){
			stm.setInt(1, id);
			ResultSet r =stm.executeQuery();
			if(r.next()) {
			int idAeroporto=r.getInt("aeroporto.idAeroporto");
			String citta=r.getString("aeroporto.citta");
			String nome=r.getString("aeroporto.nome");
			String nazione=r.getString("aeroporto.nazione");
			int numeroPiste=r.getInt("aeroporto.numeroPiste");
			
			Aeroporto aeroporto=new Aeroporto(idAeroporto, citta, nazione, nome, numeroPiste);
			return (aeroporto);
			}
			}catch(SQLException e){
				e.printStackTrace();
				} return null ;
	}

	@Override
	public boolean insert(Aeroporto a) {
		String query ="insert into aeroporto(idAeroporto,citta,nome,nazione,numeroPiste,) values(?,?,?,?,?)";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
			ps.setInt(1, a.getIdAeroporto());
			ps.setString(2,a.getCitta());
			ps.setString(3,a.getNome());
			ps.setString(4,a.getNazione());
			ps.setInt(5,a.getNumeroPiste());
			int r=ps.executeUpdate();
			return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Aeroporto a) {
		String query ="delete from aeroporto where idAeroporto=? and citta=? and nome=? and nazione=? and numeroPiste=?";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
			ps.setInt(1,a.getIdAeroporto());
			ps.setString(2,a.getCitta());
			ps.setString(3,a.getNome());
			ps.setString(4,a.getNazione());
			ps.setInt(5,a.getNumeroPiste());
			int r=ps.executeUpdate();
			
			return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
		
		
		
	}

	@Override
	public boolean update(Aeroporto a) {
			String query ="update aeroporto set nome=? where idAeroporto=?" ;

			try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
			ps.setString(1,a.getNome());
			ps.setInt(2,a.getIdAeroporto());
			int r=ps.executeUpdate();
			return r==1;
			}catch (SQLException e){
			e.printStackTrace();
			}
			return false;
	}


	

}
