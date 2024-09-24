package day5.lesCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * List list = new ArrayList(); //List list2 = new LinkedList();
		 * 
		 * System.out.println(list.isEmpty()); System.out.println(list.size());
		 * System.out.println(list); System.out.println("************");
		 * 
		 * 
		 * list.add("amine"); list.add(true); list.add(20);
		 * 
		 * System.out.println(list.isEmpty()); System.out.println(list.size());
		 * System.out.println(list.toString());
		 * System.out.println(list.toString().contains("true"));
		 */
		
		 List<String> names = new ArrayList<>(); // 2005: notion de generics
		 names.add("amine"); 
		 names.add("ridene"); 
		 names.add("nada");
		 names.add("salha"); 
		 names.add("salim"); 
		 //System.out.println(names);
		 names.add(2,"ali"); 
		 names.set(0, "abdou"); //
		 System.out.println(names);
		 System.out.println("************");
		 Collections.sort(names);
		 System.out.println(names);
		 System.out.println(Collections.binarySearch(names, "rahma"));
		 //System.out.println(names.remove("nada"));
		 //System.out.println(names); 
		 //System.out.println(names.contains("nada"));
		 

		// Exercice 1
		/*
		List<Animal> animals = new ArrayList<>();
		Animal a1 = new Animal(1, "chat", "minouch");
		Animal a2 = new Animal(2, "chien", "pouchi");
		Animal a3 = new Animal(3, "poisson", "willi");
		
		animals.add(a1);
		animals.add(a2);
		animals.add(a3);
		
		for (Animal e : animals) {
			System.out.println(e);
		}
		*/
		
		
	}

}
