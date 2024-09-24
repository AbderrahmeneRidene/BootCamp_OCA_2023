package day10.lesclasseAbstraite;

public class Oiseau extends Animal {
	
	String couleur;
	
	@Override
	public void seDeplacer() {
		System.out.println("Je vol");
	}
}
