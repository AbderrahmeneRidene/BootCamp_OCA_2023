package day4.exercice2;

public class Test {

	public static void main(String[] args) {
		String ch =" animals\n";
		/*ch = ch.trim();
		String c0 = ch.substring(0,1);
		c0 = c0.toUpperCase();
		ch = ch.substring(1);
		ch = c0+ch;
	    ch=ch.substring(0,ch.length()-1);
	    System.out.println(ch);*/
		ch=ch.trim().replace("an", "An");
		System.out.println(ch);

	}

}
