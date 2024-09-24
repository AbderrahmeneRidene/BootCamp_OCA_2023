package day11.Overriding;

public class Animal {
	
	int age;
	String espece;
	String nom="Animal";
	
	public static void eat() {
		System.out.println("Je suis Animal");
	}
	
	public void info(double x) {
		System.out.println("Hello Animal");
	}
	
	
	public void info(String msg) {  // surcharge de methode
		System.out.println("Hello Animal");
	}

}
