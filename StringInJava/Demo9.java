package StringInJava;

public class Demo9 
{
  public static void main(String[] args)
  {
	 //Muttable String -> StringBuffer and StringBuilder
	  /*Note: we can't create the object of StringBuffer and StringBuilder using "Literal"
	   Like String :
	   => we have to create the object of muttble String using new keyword .
	   => and in mutable String we can change the original object at the same 
	   memory location.*/
	  
	 // StringBuilder sb="Java Developer"; //It will Provide compile Time Error.
	//  StringBuffer sb="Java Developer";
	  
	  /*StringBuffer and StringBulder Has only one diffrence 
	   -> StringBuilder not Thread Safe.
	   -> StringBuffer Thread sade (syncronized keyword)
	   */
	  
	  /*Note : Ham Pad chuke hai ki StringBuffer and StringBulder me sirf thread safty ka hi difference
	   hai to ham StringBuffre par ho aage badte hai.*/
	  
//	  StringBuffer sb=new StringBuffer("Monu Kumar");
//	  System.out.println(sb);
	  
	  StringBuffer sb=new StringBuffer();
	  System.out.println(sb.capacity());
	  
	  /*Note : character of sequence ka default capacity -> 16 hota hai but agar ham 16
	    se jyda character ka String likhte hau to ye kuchh yese capacity grow karta hai.
	    => (old *2 +2 ) => 16*2+2=34 ho jayega 
	    ->Agar Capacity se ek bhi character bada to.
	    =>(old*2+2)=>34*2+2=70 ho jayega 
	    */
	  
	  StringBuffer sb1=new StringBuffer("Monu Kumar");
	  System.out.println(sb1.capacity());
	  
	  /*Ab Capacity 26 print karega kyu ki maine constructor me 10 character pahale hi likh diya hai
	   note agar ham constructor me value dal dete hai to o capacity se sath hi count hoga.*/
  }
}
