package day8_chap4.passageparametre;

public class Main {
	
	// exemple 1 : 	vec un type primitif
	public static void permut(int a,int b) {
		int aux;
		System.out.println("a = "+a+"  ***  b = "+b);
		aux = a;
		a=b;
		b=aux;
		System.out.println("a = "+a+"  ***  b = "+b);
	}
	// exemple 2 : avec un type reference
	public static void modifSB(StringBuilder sb) {
		sb = sb.append ("-ocp");
	}
	
	// exemple 3 : avec un type immutable
	public static void modifS(String s) {
		s = s.concat("-ocp");
	}
	

	public static void main(String[] args) {
		// meme choses pour tous les types primitifs
		/*int x =10 ;int y = 20;
		permut(x,y);
		System.out.println("x = "+x+"  ***  y = "+y);*/
		
		// exemple 2 : type reference mutable, exemple String Builder
		/*
		StringBuilder sb = new StringBuilder("oca");
		modifSB(sb); // passage de parametre par valeur/par copie 
		System.out.println("sb= "+sb);
		*/
		// exemple 3 : type refernce immutable, exemple string
		
		String s = new String("oca"); 
		modifS(s); // passage de parametre par valeur/par copie 
		System.out.println("s= "+s);

	}

}
