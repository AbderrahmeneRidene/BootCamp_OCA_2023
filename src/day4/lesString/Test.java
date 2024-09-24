package day4.lesString;

public class Test {

	public static void main(String[] args) {
		// 1) les classe String (classe ummitable غير قابل للتغيير)
		
		int x=20;
		double moy=10.5;
		String s1="OCA";
		String s2= new String("OCA");
		String s3="OCA";
		/*
		//System.out.println("s1==s2 "+s1==s2); //false
		//System.out.println("s1==s3 "+s1==s3); //true
		System.out.println("s1==s2"+(s1==s2)); //false
		System.out.println("s1==s3"+(s1==s3)); //true
		System.out.println("s1.equals(s2) "+s1.equals(s2));
		//s1.concat("-OCP");
		//System.out.println(s1);
		/*
		Animal a1 =new Animal(1,2,1,"chat"); 
		Animal a2 =new Animal(1,2,1,"chat"); 
		System.out.println("a1= "+a1);
		System.out.println("a2= "+a2);
		System.out.println("a1==a2 "+(a1==a2));
		System.out.println("a1.equals(a2) "+a1.equals(a2));
		*/
		/*
		// les methodes en String
		
		String ch = "Animals";
		
		/*System.out.println(ch.length());
		System.out.println(ch.charAt(5)); // tati int iraja3lek char
		System.out.println(ch.indexOf("b")); //ta3ti string iraja3lek ill position mte3a fil chaine de caractere
		System.out.println(ch.substring(3));
		System.out.println(ch.substring(0,1));
		System.out.println(ch.toUpperCase());
		System.out.println(ch.toLowerCase());
		System.out.println(ch.equalsIgnoreCase("ANIMALS"));
		System.out.println(ch.equals("ANIMALS"));
		System.out.println(ch.toUpperCase().startsWith("an".toUpperCase()));
		
		System.out.println(ch.endsWith("s"));
		System.out.println(ch.contains("An"));
		System.out.println(ch.replace('a','A'));
		System.out.println(ch);
		
		String formation ="\t spring boot \n";
		System.out.println(formation);
		System.out.println(formation.trim());
		
		*/
		
		
		// 2) StringBuilder(not thread Safe, Mutable)
		
		//StringBuilder sb1 = new StringBuilder();
		/*
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.append("ocaocaocaocaocaocaocaocaocaocaoca");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		StringBuilder sb1 = new StringBuilder(8);
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		System.out.println("******");
		StringBuilder sb2 = new StringBuilder("oca");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		*/
		// les methodes de la classe StringBuilder
		/*
		sb1.append("oca");
		System.out.println(sb1);
		*/
		
		// 3) StringBuffer(thread Safe, Mutable)
		
		// StringBuffer sbf = new  StringBuffer("OCA");
		//String f ="tuna";
		//System.out.println(f);
		String password = "xpjs iuur dghw adxe";
		System.out.println(password.length()-(password.length()/4)*2);
		String hiddenPassword = "";
		for(int i = 0;i<(password.length()-(password.length()/4)*2);i++) {
			hiddenPassword=hiddenPassword+"*";
		}
		System.out.println(hiddenPassword+"  "+hiddenPassword.length());
		System.out.println(password.substring(0,password.length()/4)+""+password.substring(password.length()-password.length()/4,password.length()));
	}

}
