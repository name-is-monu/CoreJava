package ExceptionHandling;

import java.util.Scanner;

public class ExceprionHandling1
{

	public static void main(String[] args)
	{
		/*
		 * System.out.println("Connection Establish ..");
		 * 
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter a Numerator :");
		 * int n=sc.nextInt();
		 * 
		 * System.out.println("Enter a Denominator :"); int d=sc.nextInt();
		 * 
		 * int res=n/d;
		 * 
		 * System.out.println("Result is :"+res);
		 * 
		 * System.out.println("Connection Terminate ..");
		 */
		
		try 
		{
			System.out.println("Connection Establish ..");
			 
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Enter a Numerator :");
			 int n=sc.nextInt();
			 
			 System.out.println("Enter a Denominator :");
			 int d=sc.nextInt();
			 
			 int res=n/d;
			 
			 System.out.println("Result is :"+res);
			 

		}
		catch (Exception e)
		{
			System.out.println("Kindly provide the non-zero number :");
		}
		
		System.out.println("Connection Terminate ..");
	}

}

/*Agar ham try and catch ka use karke Exception handle nhi karege to Exception jis line me aayega uske
  baad ka koe bhi code line execute nhi hoga program puri tarah se terminate ho jayega 
  Esi liye esko handle karna must hai .
  
  Note: try{} block ke andar error aayeag tabhi catch(){} block chalega and Exception handling
  code eske andar ka chalega agar Error nhi aaya to catch(){} block nhi chalega ..
  */
