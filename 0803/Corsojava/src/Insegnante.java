
public class Insegnante extends Persona {
	
	String materia="matematica";
	String [] classi= {"1d","2d","3d",};
	
	Insegnante(String nome, String cognome) {
		super(nome, cognome);

	}
	void insegna() {
		System.out.println("sto insegnando matematica");
	}

}
