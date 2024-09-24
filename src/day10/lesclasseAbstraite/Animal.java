package day10.lesclasseAbstraite;

public abstract class Animal {
	
	int age;
	String espece;
	
	public void dormir() {
		System.out.println("Je dors");
	}
	
	public void manger() {
		System.out.println("Je mange");
	}

	protected abstract void seDeplacer();//public abstract void seDeplacer();
	

}
