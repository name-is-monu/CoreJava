package PlayWithJava;

public class PrintAtoZ
{

	public static void main(String[] args)
	{
		int num1=65;
		int num2=90;
		
		System.out.println("Big ...");
		while(num1<=num2)
		{
			char ch=(char)num1;
			System.out.println(ch);
			num1++;
		}

		System.out.println("small...");
		
		int num3=97;
		int num4=122;
		
		
		while(num3<=num4)
		{
			char ch=(char)num3;
			System.out.println(ch);
			num3++;
		}
	}

}
