package base;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * #######Incremento per 2
		for(int n=0;n<21;n++) {
			if(n%2==0) {
			System.out.println(n);
			}
		}
		
		###### tabellina
		System.out.println("Inserisci il numero di cui vuoi conoscere la tabellina:  ");
		
		Scanner sc = new Scanner(System.in);
	     int i = sc.nextInt();
	    
	    		 
		for(int n=0;n<11;n++) {
			System.out.println(n*i);
		} 
		######### trinagolo di asterischi
		int n;
		Scanner lettore = new Scanner(System.in);
		
		System.out.print("digita dimensione: ");
		n=lettore.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)  
			                        
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		###### fibonacci
		
		  int nextNumber(int numero){
				    if(numero==0 || numero==1)
				    {
				        return 1;
				    }else
					    { return nextNumber(numero-1)+nextNumber(numero-2);
		
					    }
		  
		}
	
		########## esercizio voto
		Scanner sc = new Scanner(System.in);
		 System.out.println("Innserisci il voto della prova scritta compreso tra -8 e 8 : ");
		 int ps = sc.nextInt();
		 if(ps >=-8 && ps<=8) {ps=ps;
			 
		 }else { System.out.println("Voto non valido");
			 
		 }
		 
		 System.out.println("Innserisci il voto della prova orale compreso tra 0 e 24 : ");
		 int pp = sc.nextInt();
		 if(pp >=0 && pp<=24) {pp=pp;
		 
		 }else {
			 System.out.println("Voto non valido");
		 }
		 
		 int voto=ps+pp;
		 
		 
		 if (ps<=0 && voto>18) {
			 System.out.println("Sei stato bocciato");
			 } else if(ps<=0 && pp<18) {
				 System.out.println("Sei stato bocciato");
			 }else if(ps>0 && voto<18) {
				 System.out.println("Sei stato bocciato");
			 }else if(voto==31 || voto==32) {
				 System.out.println("Congratulazioni sei stato promosso con lode");
			 }else {
				 System.out.println("Promosso con voto: " +voto);
			 }
		 
		#####numero random
		for(int n = (int) (Math.random() *10);n<10;n++) {
		System.out.println(n); 
		}*/
	}
}