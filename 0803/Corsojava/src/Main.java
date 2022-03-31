import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//############# array
		/*String[] nome = new String[6];
		nome[0] ="luca";
		nome[1] ="marco";
		nome[2] ="alex";
		nome[3] ="pero";
		nome[4] ="john";
		nome[5] ="franck";
		
		String [] nome = {"luca","marco","giuseppe"};
		System.out.println("sto chiamando "+ nome[0]);*/
		
		
		/* ############## array bidimensionale
		String [][] classi=new String [3][3];
				
		classi[0][0]="Luca";
		classi[0][1]="Marco";
		classi[0][2]="Anna";
		
		classi[1][0]="Luca";
		classi[1][1]="Marco";
		classi[1][2]="Anna";
		
		classi[2][0]="Luca";
		classi[2][1]="Marco";
		classi[2][2]="Anna";
		
		for (int classe=0;classe<classi.length; classe++) {
			System.out.println();
			for(int studente=0; studente<classi[classe].length;studente++) {
				System.out.println(classi[classe][studente]+" ");
			}*/
		
		/*String [][] classi= {
				{"luca","marco","antonio"},
				{"franco ","giuseppe","ferdinando"},
				{"fetido","melchiorre","imposimato"};
				
		}
		
		
		
		
		
		
		Persona persona1=new Persona("Luca","Rianna");
		persona1.saluta();
		
		Studente studente1=new Studente ("Guido","Guidi");
		studente1.saluta();
		
		°########## interfaccia
		
		Leone leone=new Leone();
		Gazzella gazzella= new Gazzella();
		Pesce pesce=new Pesce();
		
		
		leone.caccia();
		gazzella.scappa();
		pesce.caccia();
		
	########## creazione di un file e scrittura con java
		try {
			FileWriter writer = new FileWriter("prova.txt");
			writer.write("ciao sono luca, un tuo caro amico");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//casting
		//hashmap
		
		//HashMap<String,String> eta=new Hashmap<String,String>();
		
		//Iteratore
		ArrayList<String> persone= new ArrayList <String>();
		persone.add("Luca");
		persone.add("Anna");
		persone.add("Marco");
		persone.add("Lucio");
		
		Iterator<String> it=persone.iterator();
		  
		  //System.out.println(it.next());stampa manuale
		//System.out.println(it.next());//ciclo
		while(it.hasNext()) {
		String persona=it.next();
		if (persona=="Anna") {
			it.remove();
		}
		
			
			
		System.out.println(persone);
		
		}
		  
		  
	}
		}
		
	


