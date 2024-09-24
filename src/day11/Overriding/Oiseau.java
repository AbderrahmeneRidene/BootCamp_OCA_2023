package day11.Overriding;

public class Oiseau extends Animal {
	
	String couleur;
	String nom="Oiseau";
	
	public static void eat() {
		System.out.println("Je suis Oiseau");
	}
	
	@Override
	public void info(double x) {
		super.info(x);
		System.out.println("Hello Oiseau");
	}
	
	public void info(String msg) {  // surcharge
		super.info(msg);
		System.out.println("Hello Oiseau"+msg);
	}

}
