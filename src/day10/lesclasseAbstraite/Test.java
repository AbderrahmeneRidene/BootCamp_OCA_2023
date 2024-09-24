package day10.lesclasseAbstraite;

public class Test {
	
	public static void info(Animal animal) {
		animal.seDeplacer();
	}

	public static void main(String[] args) {
		info(new Poisson());
		info(new Oiseau());
		info(new Serpent());
		info(new Chat());
		
		// Animal a = new Animal();
		Animal animals[] = new Animal[4]; // instanciation d'un tableau d'animal
		animals[0]= new Oiseau();
		animals[1]= new Poisson();
		animals[2]= new Serpent();
		animals[3]= new Chat();
		
		//animals : un tableau polymorphe : Polymorphisme générique
		
		for (Animal a: animals) {
			a.seDeplacer();
		}
		
		
		Animal a1 = new Oiseau();  //age et espece
		a1 = new Poisson();  // fonctionnelle
		
		
		Oiseau o1 = new Oiseau(); //age espece et couleur
		//o1 = new Poisson();  non fonctionnelle o1 de type Oiseau
		 
	}

}
