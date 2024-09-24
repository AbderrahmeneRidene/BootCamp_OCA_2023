package day1;

public class Etudiant {
	
	// Attributs d'instance
	
	String nom;
	String prenom;
	int age;
	String adresse;
	int telephone;
	
	// les methodes(les action)
	
	public void info()
	{
		System.out.println("Je suis un étudiant");
	}
	
	public int getAge() {
		return age;
	}
	 
	// les constructeurs
	
	public Etudiant() { // le constructeur par défaut (car aucun parametre)
		System.out.println("Constructeur d'un étudian");
	}  
	
	public Etudiant(String nom)  { // le constructeur avec paramètre
		this.nom = nom;
		System.out.println("Constructeur avec paramètre nom");
	}

	public Etudiant(String nom, String prenom, int age, String adresse, int telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.telephone = telephone;
	}

	
	public void affichageInfoEtudiant() {
		System.out.println("Etudiant [nom=" + this.nom + ", prenom=" + this.prenom + ", age=" + this.age + ", adresse=" + this.adresse + ", telephone="
				+ this.telephone + "]");
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse + ", telephone="
				+ telephone + "]";
	}   
	
	
	
	/*public Etudiant(String nom, String prenom, String adresse, int age, int telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.age = age;
		this.telephone = telephone;
	}*/
	
	

}
