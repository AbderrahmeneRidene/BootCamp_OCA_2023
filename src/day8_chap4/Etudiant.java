package day8_chap4;


// une classe JavaBean (Classe qui respecte L'encapsulation)
public class Etudiant {
	
	private String nom;
	private int age;
	private double moyenne;
	private boolean motorisé;
	
	public boolean isMotorisé() {
		return motorisé;
	}

	public void setMotorisé(boolean motorisé) {
		this.motorisé = motorisé;
	}

	public Etudiant(String nom, int age, double moyenne) {
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	
	
	
	

}
