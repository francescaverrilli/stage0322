package Ereditarieta;

public class Main {
	public static void main(String args[]) {
		Persona persona1=new Persona("Luca","Rianna");
		persona1.saluta();
		
		Studente studente1=new Studente("Mario","Rossi","italiano");
		studente1.saluta(); //preso direttamente da persona
		
		Insegnante insegnante1= new Insegnante("Antonio ","Grillo","matematica");
		insegnante1.saluta();
		
		
	}
	

}
