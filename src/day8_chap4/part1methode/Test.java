package day8_chap4.part1methode;

public class Test {

	public static void main(String[] args) {
		
		Application app = new Application();
		app.nb = 2;
		app.valeur = 10;
		app.grade = 3;
		Calcul cal = new Calcul();
		
		cal.somme(1, 5);
		

	}

}
