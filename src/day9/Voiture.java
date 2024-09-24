package day9;

public class Voiture {
	
	public Voiture() {
		System.out.println("constructeur par defaut");
	}
	
	public Voiture(String type) {
		this(); // appel au constructeur par defaut
		System.out.println("constructeur avec parametre");
	}
}
