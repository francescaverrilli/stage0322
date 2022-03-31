package Esecuzione;


import controller.DaoFactory;
import model.Aereo;
import model.Aeroporto;
import model.Volo;

public class Main {
	

	

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String [] args) {
		
		//volo
		//DaoFactory.getDaoFactory().getVoloDao().getAll().forEach(System.out::println);  //funziona
		//System.out.println(DaoFactory.getDaoFactory().getVoloDao().getById(2));   //funziona
		
		
		//Volo volo1=new Volo(0, null, null, null, null, 0, null);
		
		//idVolo, aereo, partenza, dataArrivo, dataPartenza, numeroPasseggeri, Arrivo
		
		
		
		 
		//System.out.println(DaoFactory.getDaoFactory().getVoloDao().insert(volo1));//funziona
		//System.out.println(DaoFactory.getDaoFactory().getVoloDao().delete(volo1));
		//System.out.println(DaoFactory.getDaoFactory().getVoloDao().update(volo1));  
		
		
		//aereo
		//DaoFactory.getDaoFactory().getAereoDao().getAll().forEach(System.out::println); //funziona
		//System.out.println(DaoFactory.getDaoFactory().getAereoDao().getById(3)); //funziona
		
		Aereo aereo1=new Aereo(12, "di linea", 200, "Boeing 777");//idAereo,nome,numeroPosti,tipo
		
		//System.out.println(DaoFactory.getDaoFactory().getAereoDao().insert(aereo1)); //funziona
		//System.out.println(DaoFactory.getDaoFactory().getAereoDao().delete(aereo1)); //funziona
		System.out.println(DaoFactory.getDaoFactory().getAereoDao().update(aereo1));

		
		   
		
		//aeroporto	
		//DaoFactory.getDaoFactory().getAeroportoDao().getAll().forEach(System.out::println);
		//System.out.println(DaoFactory.getDaoFactory().getAeroportoDao().getById(1));//funziona
		
		Aeroporto aeroporto1=new Aeroporto(12, "Teano", "Incontro", "Italia", 5);
		
		//System.out.println(DaoFactory.getDaoFactory().getAeroportoDao().insert(aeroporto1));
		//System.out.println(DaoFactory.getDaoFactory().getAeroportoDao().delete(aeroporto1));
		/*System.out.println(DaoFactory.getDaoFactory().getAeroportoDao().update(aeroporto1));*/
		
		


			
		
		
	}
}
