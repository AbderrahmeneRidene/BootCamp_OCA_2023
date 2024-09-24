package day2;

//import day1.Employer;
//import day1.Etudiant;
import day1.*;
import day1.part1.CompteBancaire;
import day2.part1.*;
import day2.part2.*;
import day2.part2.C;

public class Test {

	public static void main(String[] args) {
		
		CompteBancaire cb = new CompteBancaire();
		
		Voiture v = new Voiture();
		Etudiant e1 = new Etudiant();
		Employer emp = new Employer();   
		
		System.out.println(Animal.MAX_AGE);
		System.out.println(Animal.MAX_POIDS);
		/*
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		/*
		System.out.println(a2.MAX_AGE);
		System.out.println(a1.MAX_AGE);
		
		
		int x = 0;
		System.out.println(x);
		*/
		
		/********** les packages  ********/
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		D d = new D();
		E e = new E();

	}

}
