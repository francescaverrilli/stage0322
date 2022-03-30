package controller.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.GenericDao;
import model.Aereo;
import model.Aeroporto;
import model.Volo;

public class VoloDaoImplementation implements GenericDao<Volo>{

	private static VoloDaoImplementation instance=new VoloDaoImplementation();
	private VoloDaoImplementation() {
		
	} 
	public static VoloDaoImplementation getInstance() {
		return instance;
	}
	
	@Override
	public List<Volo> getAll() {
		List<Volo> result=new ArrayList<Volo>();
		
		try(Connection c=JdbcDaoFactory.getConnection(); Statement stm=c.createStatement()){
			
			String query="SELECT * FROM VOLO JOIN AEREO ON AEREO.IDAEREO=VOLO.AEREO JOIN AEROPORTO AS PARTENZA ON PARTENZA.IDAEROPORTO=VOLO.PARTENZA JOIN AEROPORTO AS ARRIVO ON ARRIVO.IDAEROPORTO=VOLO.ARRIVO";
			ResultSet r =stm.executeQuery(query);
			while(r.next()) {
				int idPartenza=r.getInt("partenza.idAeroporto");
				String cittaPartenza=r.getString("partenza.citta");
				String nomePartenza=r.getString("partenza.nome");
				String nazionePartenza=r.getString("partenza.nazione");
				int numeroPistePartenza=r.getInt("partenza.numeroPiste");
				
				Aeroporto partenza=new Aeroporto(idPartenza, cittaPartenza, nazionePartenza, nomePartenza, numeroPistePartenza);
				
				int idArrivo=r.getInt("arrivo.idAeroporto");
				String cittaArrivo=r.getString("arrivo.citta");
				String nomeArrivo=r.getString("arrivo.nome");
				String nazioneArrivo=r.getString("arrivo.nazione");
				int numeroPisteArrivo=r.getInt("arrivo.numeroPiste");
				
				Aeroporto Arrivo=new Aeroporto(idArrivo, cittaArrivo, nazioneArrivo, nomeArrivo, numeroPisteArrivo);
				
				
				 int idAereo=r.getInt("aereo.idAereo");
				 String nome=r.getString("aereo.nome");
				 int numeroPosti=r.getInt("aereo.numeroPosti");
				 String tipo=r.getString("aereo.tipo");
				 
				 Aereo aereo=new Aereo(idAereo,nome,numeroPosti,tipo);
				 
				 int idVolo=r.getInt("volo.idVolo");
			     String dataArrivo=r.getString("volo.dataArrivo");
				 String dataPartenza=r.getString("volo.dataPartenza");
				 int numeroPasseggeri=r.getInt("volo.numeroPasseggeri");
				 
				 Volo volo=new Volo(idVolo, aereo, partenza, dataArrivo, dataPartenza, numeroPasseggeri, Arrivo);
				 result.add(volo);
					
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Volo getById(int id) {
		String query="SELECT * FROM VOLO JOIN AEREO ON AEREO.IDAEREO=VOLO.AEREO JOIN AEROPORTO AS PARTENZA ON PARTENZA.IDAEROPORTO=VOLO.PARTENZA JOIN AEROPORTO AS ARRIVO ON ARRIVO.IDAEROPORTO=VOLO.ARRIVO WHERE VOLO.IDVOLO=?";
		try(Connection c=JdbcDaoFactory.getConnection(); PreparedStatement stm=c.prepareStatement(query)){
			stm.setInt(1, id);
			
			ResultSet r =stm.executeQuery();
			if(r.next()) {
				int idPartenza=r.getInt("partenza.idAeroporto");
				String cittaPartenza=r.getString("partenza.citta");
				String nomePartenza=r.getString("partenza.nome");
				String nazionePartenza=r.getString("partenza.nazione");
				int numeroPistePartenza=r.getInt("partenza.numeroPiste");
				
				Aeroporto partenza=new Aeroporto(idPartenza, cittaPartenza, nazionePartenza, nomePartenza, numeroPistePartenza);
				
				int idArrivo=r.getInt("arrivo.idAeroporto");
				String cittaArrivo=r.getString("arrivo.citta");
				String nomeArrivo=r.getString("arrivo.nome");
				String nazioneArrivo=r.getString("arrivo.nazione");
				int numeroPisteArrivo=r.getInt("arrivo.numeroPiste");
				
				Aeroporto Arrivo=new Aeroporto(idArrivo, cittaArrivo, nazioneArrivo, nomeArrivo, numeroPisteArrivo);
				
				
				 int idAereo=r.getInt("aereo.idAereo");
				 String nome=r.getString("aereo.nome");
				 int numeroPosti=r.getInt("aereo.numeroPOsti");
				 String tipo=r.getString("aereo.tipo");
				 
				 Aereo aereo=new Aereo(idAereo,nome,numeroPosti,tipo);
				 
				 int idVolo=r.getInt("volo.idVolo");
			     String dataArrivo=r.getString("volo.dataArrivo");
				 String dataPartenza=r.getString("volo.dataPartenza");
				 int numeroPasseggeri=r.getInt("volo.numeroPasseggeri");
				 
				 Volo volo=new Volo(idVolo, aereo, partenza, dataArrivo, dataPartenza, numeroPasseggeri, Arrivo);
				 return (volo);
					
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insert(Volo a) {
		String query ="insert into volo(nome,numeroPosti,tipo) values(?,?,?)";

		try(Connection c=JdbcDaoFactory.getConnection();PreparedStatement ps=c.prepareStatement(query)){
		ps.setString(1,"");//nelle virgolette va inserito il valore che si vuole dare ai ???
		ps.setInt(2,1);
		ps.setString(3,"");
		int r=ps.executeUpdate();
		return r==1;
		}catch (SQLException e){
		e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean delete(Volo a) {
		String query ="delete * from volo where id=?";

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
	public boolean update(Volo a) {
		String query ="update volo set name=? id=?";

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
