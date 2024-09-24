package day10.Exercice1;

public class Testeur extends Employer {

	
	public Testeur(String nom, String prenom, int age, double salaireBase) {
		super(nom,prenom,age,salaireBase);
	}
	@Override
	public double calculSalaire() {
		return this.getSalaireBase()+ this.getSalaireBase()*0.2;
	}

}
