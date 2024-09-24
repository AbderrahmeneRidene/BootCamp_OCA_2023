package day11.Hidding;

public class Test {

	public static void main(String[] args) {
		/*Oiseau o = new Oiseau();
		o.callAnimal();      //                
		o.callOiseau();       // */
		
		// le polymorpphismz d'heritage
		
		new Animal();
		Animal a = new Animal();
		Oiseau o = new Oiseau();
		
		//a=o;  // UpCasting OK
		//o=a;  // DownCasting + erreur de compilation
		
		//o=(Oiseau)a;  // DownCasting + cast explecite => runtimeException
		
		Oiseau o2 = new Oiseau();
		a=o2; // upCasting
		o=(Oiseau)a;   // DownCasting + cast explecite + upCast => OK
		
	
		
		System.out.println("fin du programme");

	}

}
