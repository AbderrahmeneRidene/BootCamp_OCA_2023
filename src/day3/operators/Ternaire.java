package day3.operators;

public class Ternaire {

	public static void main(String[] args) {


		double moy = 15.5;
		
		String mention = (moy>=10)?"Success":"Fail";
		
		int res = (moy>=10)?100:-100;
		
		System.out.println(mention);
		System.out.println(res);

	}

}
