
public class Studente extends Persona  {
	String materiaPreferita="storia";
	String classe="20";
	int[] votiStoria= {9,9,9};
	
	Studente(String nome, String cognome) {
		super(nome, cognome);
		
	}
		void studia() {
		System.out.println("sto studiando matematica");
	}
	

}
