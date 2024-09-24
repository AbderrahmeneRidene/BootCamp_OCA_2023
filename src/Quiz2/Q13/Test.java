package Quiz2.Q13;

public class Test {

	public static void main(String[] args) {
		
		WildAnimal wolf = new WildAnimal("Long");
		WildAnimal tiger = new WildAnimal("Feline",80,"short");
		System.out.println(wolf.type+ " "+wolf.maxSpeed+" "+wolf.bounds);
		System.out.println(tiger.type+ " "+tiger.maxSpeed+" "+tiger.bounds);
		

	}

}
