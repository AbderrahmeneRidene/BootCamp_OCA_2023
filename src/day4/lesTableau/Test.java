package day4.lesTableau;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		/*
		//declaration
		int [] tab= {10,20,30};
		int tab2[]= new int[3];
		tab2[0]=100;
		tab2[1]=200;
		tab2[2]=300;
		
		
		// parcours d'un tableau
		
		for (int i=0;i<tab.length;i++) {
			System.out.print(tab[i]+"\t");
		}
		System.out.println();
		for(int e:tab) {
			System.out.print(e+"\t");
		}
		*/
		
		// les methodes sort et binarySearch 
		/*
		int tab[]= {10,4,2,18,3};
		System.out.println();
		for(int e:tab) {
			System.out.print(e+"\t");
		}
		
		Arrays.sort(tab);
		System.out.println();
		for(int e:tab) {
			System.out.print(e+"\t");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(tab,12));
		*/
		int[][]tab = new int[3][];
		tab[0]=new int[4];
		tab[1]=new int[2];
		tab[2]=new int[6];
		
		for(int t[]:tab) {
			for(int e:t) {
				System.out.print(e+"\t");
			}
			System.out.println();
		}

	}

}
