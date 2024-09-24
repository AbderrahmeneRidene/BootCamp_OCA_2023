package day4.exercice1;

public class Test {

	public static void main(String[] args) {

		Etudiant e1 = new Etudiant(1, 5491881, "Ridene");
		Etudiant e2 = new Etudiant(1, 5491881, "Ridene");

		System.out.println(e1.equals(e2));
		System.out.println(e1.toString());

	}

}
