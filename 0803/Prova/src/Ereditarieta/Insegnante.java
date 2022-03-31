package Ereditarieta;

public class Insegnante extends Persona {

	String materia="matematica";

	
	Insegnante(String nome, String cognome,String materia) {
		super(nome, cognome);
		this.materia=materia;
		
	}
	
	void insegna() {
		System.out.println("Sto insegnando");
	}
	
	@Override 
	void saluta() { 
		System.out.println("Buongiorno miei prodi");
	}

}
