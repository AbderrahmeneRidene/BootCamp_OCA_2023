package day10.Exercice1;

public abstract class Employer {
	
	private String nom;
	private String prenom;
	private int age;
	private double salaireBase;
	
	
	
	
	public Employer(String nom, String prenom, int age, double salaireBase) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.salaireBase = salaireBase;
	}
	public Employer() {
		super();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalaireBase() {
		return salaireBase;
	}
	public void setSalaireBase() {
		this.salaireBase = salaireBase;
	}
	
	@Override
	public String toString() {
		return "Employer [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", salaireBase=" + salaireBase + " salaire= "+calculSalaire()+" ]";
	}
	
	protected abstract double calculSalaire();
	

}
