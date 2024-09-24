package day2.garbageCollector;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		//String ch =null;
		//System.out.println(ch.length());
		Voiture v1 = new Voiture();
		Voiture v2 = new Voiture();
		Voiture v3 = new Voiture();
		 
		v1 = v3;
		v2 = null;
		 
		//System.gc(); // appel explicite au garbage collector
		
		for (int i = 0;i<100;i++) {
			System.out.println("i = "+i);
		}
		
		System.out.println("Fin du programme");
		
		
		
	}

}
