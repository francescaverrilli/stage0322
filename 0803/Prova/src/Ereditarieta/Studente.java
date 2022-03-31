package Ereditarieta;

public class Studente extends Persona{

	String materiaPreferita="Matematica";
	String classe="1i";

	
	
	Studente(String nome, String cognome, String materiaPreferita) {
		super(nome, cognome);
		this.materiaPreferita=materiaPreferita;
		
	}

	
	void studia() {
		
		System.out.println("Sto imparando");

	}
	
	@Override
	void saluta() { 
		System.out.println("Buongiorno prof");
	}
}
