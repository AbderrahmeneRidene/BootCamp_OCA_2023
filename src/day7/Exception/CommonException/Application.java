package day7.Exception.CommonException;

public class Application {

	public static void main(String[] args) {
		int age = -25;
		try {
			if (age<0) throw new IllegalArgumentException("Age negatif"); //the programmer throw exception
			else System.out.println("Age ok"); // envois de l'age vers la base
		}
		catch(Exception e){
			System.out.println("Problème : "+e.getMessage());
		}
		
		System.out.println("Fin du programme");
		
	}

}
