package day5.lesCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassageTableau_List {

	public static void main(String[] args) {
		/*
		// passage de liste vers tableau
		List<String> names =new ArrayList<>();
		names.add("siwar");
		names.add("amir");
		names.add("sabri");
		
		Object tab[] = names.toArray();
		*/
		// passage de tableau vers list
		String []names= new String[3];
		names[0]="siwar";
		names[1]="salim";
		names[2]="sabri";
		
		List<String> list = Arrays.asList(names); 
		// ma tnajamech tbadel chay fil list 5ater mipointiya 3ala tableau
		System.out.println(list);
		
		
		
	}

}
