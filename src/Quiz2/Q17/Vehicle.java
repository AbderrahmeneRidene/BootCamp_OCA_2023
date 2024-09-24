package Quiz2.Q17;

class Vehicle {
	String type = "4w";
	int maxSpeed = 100;
	
	Vehicle(){}
	
	Vehicle(String type,int maxSpeed){
		this.type = type;
		this.maxSpeed = maxSpeed;
	}

}

class Car extends Vehicle{
	/*
	Car(String type, int maxSpeed) {
		super(type, maxSpeed);
		// TODO Auto-generated constructor stub
	}*/

	String trans;
/*
	Car(String type, int maxSpeed) {
		super(type, maxSpeed);
		// TODO Auto-generated constructor stub
	}*/
	
	Car(String trans){
	}
	
	Car(String type, String trans){
		
	}
	
	
	
}

