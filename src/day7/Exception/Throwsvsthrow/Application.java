package day7.Exception.Throwsvsthrow;

public class Application {

	public static void info() throws RuntimeException //Unchecked (non vérifié)
	{
		System.out.println("Hello java");
		throw new ArithmeticException();
	}
	
	public static void info2() throws Exception //Checked (vérifié)
	{
		System.out.println("Hello java");
		throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		info();
		try {
			info2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin du programme");
		
	}

}
