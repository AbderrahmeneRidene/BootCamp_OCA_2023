package day8_chap4.part1methode;

public class Main {
	
	public static void somme(int ... tab) {
		int res = 0;
		for(int i=0;i<tab.length;i++) {
			res = res + tab[i];
		}
		System.out.println(res);
	}
	
	public static void so(int a, double b, int ... tab) {
		int res = 0;
		for(int i=0;i<tab.length;i++) {
			res = res + tab[i];
		}
		System.out.println(res+a+b);
	}
	/*
	public static void somme(int a,int b,int c) {
		System.out.println(a+b+c);
	}*/

	public static void main(String[] args) {
		somme(1,5,8,7,9);
		somme();
		
	}

}
