package day1;

public class Test {

	public static void main(String args[]) {
		/*
		Etudiant e3 = new Etudiant("ridene","Abderrahmene",31,"carthage byrsa",58785409);
		e3.affichageInfoEtudiant();
		*/		/*
		System.out.println("From zero to hero");
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		byte x = 10;
		
		int y = 2000;
		
		boolean result = true;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		*/
		
		Etudiant e1 = new Etudiant();  // créer un objet de type étudiant referencé par e1
		System.out.println(e1.toString());
		
		Etudiant e2 = new Etudiant("Ridene"); // Constructeur avec parametre 
		System.out.println(e2);
		
		/*
		System.out.println("Nom : "+e1.nom);
		System.out.println("Age : "+e1.age);
		
		e1.nom = "Ridene";
		e1.age = 25;
		
		System.out.println("Nom : "+e1.nom);
		System.out.println("Age : "+e1.age);
		
		e1.info();
		*/
	}

}
