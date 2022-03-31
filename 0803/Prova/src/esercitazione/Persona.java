package esercitazione;

public class Persona {
	
	String nome;
	String cognome;
	String lavoro;
	//costruttore
	 
	Persona(String nome,String cognome,String lavoro){
		
		this.nome=nome;
		this.cognome=cognome;
		this.lavoro=lavoro;
		
	}
	//permette di stampare tutta la persona
	public String toString() {
		String stringa=this.nome+"  "+this.cognome+"  "+this.lavoro;
		return stringa;
		
	}
	void saluta(Persona personaDaSalutare) { //passare oggetti come parametri
		System.out.println("salve da " +personaDaSalutare.nome+ " io sono "+this.nome );
	}
	

}
