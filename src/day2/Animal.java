package day2;

import java.time.LocalDate;



public class Animal {
	
	// attributs de classe
	
	
	static int MAX_POIDS = 1000;
	static double MAX_AGE = 200;
	
	// attributs d'instance
	 
	String nom;
	int age;
	double poids;
	
	
	// methodes
	
	public void info() {
		LocalDate date = LocalDate.now();
		//LocalDate date
		System.out.println("Il est : "+date);
	}
	// Constructeur
	public Animal() {
		System.out.println("Constructeur par defaut");
	}
		
	// Bloc d'initialisation d'instance
	{
		System.out.println("Bloc d'initialisation d'instance num 1");
	}
	{
		System.out.println("Bloc d'initialisation d'instance num 2");
	}
	
	// Bloc d'initialisation d'un classe
	
	static {
		System.out.println("un bloc d'initialisation de classe");
	}
	
	
	
	
	
}
