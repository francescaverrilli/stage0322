package Esecuzione;

import controller.AereoDaoImplements;
import controller.DaoFactory;
import dao.AereoDao;
import model.Aereo;
import model.Aeroporto;
import model.Volo;

public class Main {
	

	public static void main(String [] args) {
		
		DaoFactory.getDaoFactory().getVoloDao().getAll().forEach(System.out::println);
		System.out.println(DaoFactory.getDaoFactory().getVoloDao().getById(1));
		
		Volo volo1=new Volo(0, null, null, null, null, 0, null);
		 
		System.out.println(DaoFactory.getDaoFactory().getVoloDao().insert(volo1));
		System.out.println(DaoFactory.getDaoFactory().getVoloDao().delete(volo1));

		
		DaoFactory.getDaoFactory().getAereoDao().getAll().forEach(System.out::println);
		System.out.println(DaoFactory.getDaoFactory().getAereoDao().getById(1));
		
		Aereo aereo1=new Aereo(0, null, 0, null);
		
		System.out.println(DaoFactory.getDaoFactory().getAereoDao().insert(aereo1));
		System.out.println(DaoFactory.getDaoFactory().getAereoDao().delete(aereo1));

				
		DaoFactory.getDaoFactory().getAeroportoDao().getAll().forEach(System.out::println);
		System.out.println(DaoFactory.getDaoFactory().getAeroportoDao().getById(1));
		
		Aeroporto aeroporto1=new Aeroporto(0, null, null, null, 0);
		
		System.out.println(DaoFactory.getDaoFactory().getAeroportoDao().insert(aeroporto1));
		System.out.println(DaoFactory.getDaoFactory().getAeroportoDao().delete(aeroporto1));

		
	}
}
