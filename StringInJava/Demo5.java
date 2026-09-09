package StringInJava;

public class Demo5 
{
   public static void main(String[] args)
   {
	   String name="Monu";
	   String fullName=name+" Kumar";
	   System.out.println(fullName);
	   
	   String fullName1="Monu Kumar";
	
	   System.out.println(fullName1);
	   
		/*Output -> 
		 * Monu Kumar
		 * Monu kumar
		 */
      
	   System.out.println(fullName.equals(fullName1)); //true because object data same 
	   System.out.println(fullName==fullName1); //false because we have created the fullName String 
	                                           //using the name reference variable so it will store in Heap
	        //and fullName1 String object we have create teh using Literal so it will 
	        //store in the String Constant Pool
   }
}
