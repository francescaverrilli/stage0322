package model;

public class Aeroporto {
	private int idAeroporto;
	private String citta;
	
	
	
	public Aeroporto(int idAeroporto, String citta, String nazione, String nome, int numeroPiste) {
		super();
		this.idAeroporto = idAeroporto;
		this.citta = citta;
		this.nazione = nazione;
		this.nome = nome;
		this.numeroPiste = numeroPiste;
	}
	public int getIdAeroporto() {
		return idAeroporto;
	}
	public void setIdAeroporto(int idAeroporto) {
		this.idAeroporto = idAeroporto;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroPiste() {
		return numeroPiste;
	}
	public void setNumeroPiste(int numeroPiste) {
		this.numeroPiste = numeroPiste;
	}
	private String nazione;
	private String nome;
	private int numeroPiste;



	@Override
	public String toString() {
		return "Aeroporto [idAeroporto=" + idAeroporto + ", citta=" + citta + ", nazione=" + nazione + ", nome=" + nome
				+ ", numeroPiste=" + numeroPiste + "]";
	}
	

}
