package oppsconcepts.statickeyword;

class Test1
{
	private static int num1;
	private static int num2;
	
	static
	{
		System.out.println("Static block is executed");
		num1=10;
		num2=20;
	}
	
	public static void disp()
	{
	   System.out.println("num 1 :"+num1);
	   System.out.println("num 2 :"+num2);
	}
}


public class Demo
{
	public static void main(String[] args) 
	{
//		Test.disp();
	}

}
