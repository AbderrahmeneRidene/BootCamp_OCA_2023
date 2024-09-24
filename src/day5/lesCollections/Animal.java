package day5.lesCollections;

public class Animal {
	
	int id;
	String espece;
	String nom;
	
	public Animal(int id, String espece, String nom) {
		super();
		this.id = id;
		this.espece = espece;
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", espece=" + espece + ", nom=" + nom + "]";
	}
	
	

}
