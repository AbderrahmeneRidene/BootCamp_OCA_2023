package day3.operators;

public class OperateurLogique {

	public static void main(String[] args) {
		// AND = &&, OR = ||
		
		int x=10 ;
		int y=20;
		
		/*
		// AND
		boolean res = (x>50)&(++y>4); // ikamel yitreti les condition ill koll
		// boolean res = (x>50)&&(++y>4); ki yal9a ill resulta mta3 ill boolean ma ikamalech
		System.out.println("res = "+res);
		System.out.println("y = "+y);
		*/
		
		// OR
		boolean res = (x<50)|(++y>4); // ikamel yitreti les condition ill koll
		// boolean res = (x>50)||(++y>4); ki yal9a ill resulta mta3 ill boolean ma ikamalech
		System.out.println("res = "+res);
		System.out.println("y = "+y);
		
		
	}

}
