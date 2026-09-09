package StringInJava;

public class Demo8 
{
   public static void main(String[] args)
   {
//	   String s1="Teluso";
//	   s1=s1+" Java";
//	   System.out.println(s1);
	   
	   /*it will print "Telusko" because String is a immutable object we can't change String 
	     same object . if we make any changes so it will return the new String Object 
	     . so we have to collect the String object .*/
	   
	   String s1="Teluso";
	   String s2=s1+" Java";
	   System.out.println(s1);
	   System.out.println(s2);
	   
   }
}
