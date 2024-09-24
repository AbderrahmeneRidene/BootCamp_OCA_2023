package day10.lesInterfaces;

public class Multifonctions implements Imprimante, Photocopieuse, Scanner{

	@Override
	public void scanner() {
		System.out.println("Je peux scanner");	
	}

	@Override
	public void photocopier() {
		System.out.println("Je peux photocopier");
	}

	@Override
	public void imprimer() {
		System.out.println("Je peux imprimer");
	}

	
}
