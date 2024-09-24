package day8_chap4.part2Lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// avant la version 8
		
		CalculImp imp =new CalculImp();
		imp.operation(2, 3);
		
		// version 8+
		
		Calcul opSom = (int x, int y)->{return x+y;}; // expression Lambda complète(verbose)
		
		Calcul opSom2 = (x,y)->x+y;
		
		System.out.println(opSom.operation(2, 3));
		
		Calcul opProd = (int x, int y)->{return x+y;}; // expression Lambda
		
		System.out.println(opProd.operation(2, 3));
		
		Predicate<String> pred = (String ch)->{return ch.contains("oc");};
		
		Predicate<String> pred2 = ch->ch.contains("oc");
		
		System.out.println(pred.test("oca"));
		
		// 
		ArrayList<String> list = new ArrayList<>();
		list.add("amine");
		list.add("ridene");
		list.add("nada");
		list.add("salim");
		list.add("ali");
		System.out.println(list);
		//Predicate<String> filtre = (String s)->{return s.contains("a");};
		//list.removeIf(filtre);
		
		// ou
		
		list.removeIf(x->x.contains("n"));
		System.out.println(list);
		
		
		
	}

}
