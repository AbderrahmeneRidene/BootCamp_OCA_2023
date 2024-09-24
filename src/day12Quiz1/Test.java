package day12Quiz1;

public class Test {
	
	static int count = 0;
	int i = 0;
	
	public void changeCount() throws ArithmeticException{
		while(i<5) {
			count++;
			i++;
			System.out.println("Ali");
			 System.out.println(10/0);
		}
	}
	
	public void changeCount2() throws Exception{
		while(i<5) {
			count++;
			i++;
			 System.out.println(10/0);
		} 
	}
	
	

	public static void main(String[] args) throws Exception   {
		/*Test check1 = new Test();
		Test check2 = new Test();
		check1.changeCount();
		System.out.println("count= "+check1.count+" i= "+check1.i);
		check2.changeCount2();
		System.out.println("count= "+check2.count+" i= "+check2.i);
		Object ch;*/
		int j=0;
 
	}
	

}
