package day3.statements;

public class Boucle {

	public static void main(String[] args) {
		
		for(int i=0, j=0;i<10&&j<5;j++,i++) {
			System.out.println(i+" "+j);
		}
		
		
		String names[]= {"zied","sondes","amine"};
		for(String name:names) {  // Enhanced Loop
			System.out.println(name);
		}

	}

}
