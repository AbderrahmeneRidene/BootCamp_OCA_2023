package Quiz2.Q13;

public class Animal {
	String type = "Canine";
	int maxSpeed = 60;
	
	Animal (){}
	
	Animal (String type, int maSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
	
	
}


class WildAnimal extends Animal{
	String bounds;
	
	WildAnimal(String bounds){
		//this("Canine",60);
		
		super();
		this.bounds=bounds;
	}
	
	WildAnimal(String type,int maxSpeed,String bounds){
		super(type,maxSpeed);
		this.bounds=bounds;
		
		
	}
}

