package day8_chap4.part2Lambda;

import day8_chap4.part1methode.Application;

public class ApplicationWeb extends Application {
	
	public void affichage() {
		System.out.println(this.grade);
		System.out.println(this.nb);
		
		Application app = new Application();
		Application ap2 = new ApplicationWeb();
		//app.grade;  le KO
		
	}
}
	
	
