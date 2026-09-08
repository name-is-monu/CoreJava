package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calc
{
	public void divide()throws ArithmeticException , InputMismatchException
	{
		  Scanner sc=new Scanner(System.in);
		 System.out.println("Enter numerator ..");
		 int num=sc.nextInt();
		   System.out.println("Enter denominator ..");
		  int  den=sc.nextInt();
		   
		int res=num/den;
		System.out.println("Result :"+res);
	}
}
public class ExceptionHandling3 
{
  public static void main(String[] args)
  {
	  Calc c=new Calc();
	  
	  System.out.println("Program Start ...");
	  
	   try 
	   {
		   
		   c.divide();
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println("Kindly provide non-zero value of denominator..");
	   }
	   catch (InputMismatchException e)
	   {
		System.out.println("Kindly provide decimal values ..");
	   }
	   catch(Exception e)
	   {
		   System.out.println(e.getMessage());
	   }
	   
	   System.out.println("Program Ends ...");
   }
}


/* Hamne (throws ArithmeticException , InputMismatchException) Jariye Exception ko Duck kiya hai 
  Aur ham dekh skte hai ki main method me divide() method ko call and handle kiya gaya hai..*/
 