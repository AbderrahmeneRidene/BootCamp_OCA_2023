package day10.Exercice1;

public class Directeur extends Employer {

	public Directeur(String nom, String prenom, int age, double salaireBase) {
		super(nom,prenom,age,salaireBase);
	}
	
	@Override
	public double calculSalaire() {
		return this.getSalaireBase()+ this.getSalaireBase()*0.7;
	}

}
