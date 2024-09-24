package day4.exercice1;

public class Etudiant {

	int id;
	int cin;
	String nom;

	public Etudiant(int id, int cin, String nom) {
		super();
		this.id = id;
		this.cin = cin;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", cin=" + cin + ", nom=" + nom + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Etudiant) {
			Etudiant temp = (Etudiant) obj;
			return (this.id == temp.id) && (this.cin == temp.cin) && (this.nom.equals(temp.nom));
		}
		return false;
	}

}
