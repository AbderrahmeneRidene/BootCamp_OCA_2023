package day4.lesString;

public class Animal {
	
	int id;
	int age;
	double poids;
	String espece;
	
	// constructeur avec parametre
	public Animal(int id, int age, double poids, String espece) {
		super();
		this.id = id;
		this.age = age;
		this.poids = poids;
		this.espece = espece;
	}
	/*
	@Override
	public boolean equals(Object obj)
	{
		if (obj instanceof Animal) {
			Animal temp=(Animal)obj;
			return ((this.id == temp.id)&&(this.age == temp.age) && (this.poids == temp.poids) && (this.espece.equals(temp.espece)));
		}
		else return false;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", age=" + age + ", poids=" + poids + ", espece=" + espece + "]";
	}
	*/
	

}
