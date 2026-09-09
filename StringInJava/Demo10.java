package StringInJava;

public class Demo10 {

	public static void main(String[] args)
	{
//		StringBuffer sb=new StringBuffer();
//		sb.append("Monu Kumar");
//		System.out.println(sb.capacity()); 
		/*
		 - 16  beacause hamne constructoe ka use nhi kiya hai StringBuffer ak object 
		  create katne ke liye to ye default value hi prinyt karega .
		 
		  */
		
		
//		StringBuffer sb=new StringBuffer("Monu ");
//		sb.append("Kumar");  //muttable because we don't need to assign.
//		System.out.println(sb); 
		
		StringBuffer sb1=new StringBuffer("Java");
		StringBuffer sb2=new StringBuffer("Java");
		System.out.println(sb1.equals(sb2)); //false (compare ref)
		
		/*Note : Hamne Dekha tha ki String me ye Two Diffrent String Object ka Values ko 
		 comapre karke True of false deta tha ye String me value compare karne ke kaam aata hai
		 kyu equals() method Object class ka hai aur har class Object class ko extends karti hai 
		 String ne Obeject class ke method equals()  ko overide karke uski implementations ko change
		 kar diya hai jisse ye values ko comapare kare nhi to ye bhi Reference hi comapre karta hai.
		 */

	}

}
