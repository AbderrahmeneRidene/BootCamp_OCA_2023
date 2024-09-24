package day10.Exercice1;

public class Test {

	public static void main(String[] args) {
		
		
		
		Employer employer[] = new Employer[3];
		employer[0] = new Directeur("ridene","ridene",20,1000);
		employer[1] = new Developpeur("ridene","ridene",20,1000);
		employer[2] = new Testeur("ridene","ridene",20,1000);
		
		
		for (Employer e: employer) {
			System.out.println(e.toString());
		}
		

	}

}
