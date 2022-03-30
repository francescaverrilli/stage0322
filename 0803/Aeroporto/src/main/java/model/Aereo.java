package model;

public class Aereo {
	
	private int idAereo;
	private String nome;
	private int numeroPosti;
	private String tipo;
	
	
	
	public Aereo(int idAereo, String nome, int numeroPosti, String tipo) {
		super();
		this.idAereo = idAereo;
		this.nome = nome;
		this.numeroPosti = numeroPosti;
		this.tipo = tipo;
	}
	public int getIdAereo() {
		return idAereo;
	}
	public void setIdAereo(int idAereo) {
		this.idAereo = idAereo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroPosti() {
		return numeroPosti;
	}
	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Aereo [idAereo=" + idAereo + ", nome=" + nome + ", numeroPosti=" + numeroPosti + ", tipo=" + tipo + "]";
	}
	
	

}
