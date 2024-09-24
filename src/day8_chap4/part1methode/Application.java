package day8_chap4.part1methode;

public class Application {
	
	private int age;
	
	public int nb;
	
	protected int grade;
	
	int valeur; // package privé
	
	public void info() {  // methode d'instance
		System.out.println(age);
		System.out.println(grade);
	}
	
	//methode de classe
	public static double somme(int a, int b) throws ArithmeticException, NumberFormatException
	{
		return a+b;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[]args) {
		System.out.println(somme(10,8));
		Application app = new Application();
		app.info();
		app.somme(4, 5);
	}

}
