package Quiz2.Q15;

public class Employee {
	
	String name;
	boolean contract;
	double salary;
	
	Employee(){
		
		this.name = new String("Joe");
		this.contract = new Boolean("true");
		this.salary = new Double("100");
		//this("Joe",true,100);
	}
	
	public String toString() {
		return name+": "+contract+": "+salary;
	}
	

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name="Joe1";
		e.contract= true;
		e.salary=101;
		
		System.out.println(e);
		
	}

}
