package day7.Exception;

public class Main {

	public static void main(String[] args) {

		String formation = "ridene";
		try {
			System.out.println(formation.length());
			int a=2;
			int b=0;
			System.out.println(Calcul.division(a,b));
		} 
		
		catch (NullPointerException e) 
		{
			System.out.println("Un probleme de pointeur null..."+e.getMessage());
			e.printStackTrace();
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Un probleme arithmetique..."+e.getMessage());
			e.printStackTrace();
			return;
		}
		catch (Exception e) 
		{
			System.out.println("Un probleme..."+e.getMessage());
			e.printStackTrace();
		}
		
		// inajmou na3mlou try maa finally ema try wahadha ma timchich maghir catch
		finally {
			System.out.println("Suite du programme");
		}

	}

}
