package day9;

public class Oiseau extends Animal {
	
	String nom= "Oiseau";

	String couleur;
	public void infoOiseau() {
		System.out.println("Couleur = "+this.couleur+" Espece = "+this.espece+" Age = "+this.age);
	}
	
	public void Affichage() {
		System.out.println("Un Oiseau"+ " | non du fils = "+this.nom+" | nom parent = "+super.nom);
	}
	
	public void affichageTotale() {
		this.Affichage();
		super.Affichage();
	}
	
	
}
