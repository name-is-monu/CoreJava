package CollectionInJava;

import java.util.ArrayList;

public class ArrayList1 
{
    public static void main(String[] args)
    {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(0, 100); //index based insertion
		list.add(2, 500);
		System.out.println(list);
	}
}

/*Note : Every Collection childs follow the Daynamic insertion :
  -> means -> Every Implemented class can be Dynamically grow and shrink based on the data.
  
  
 => Kahan use karein (Best for): 
 Jahan aapko data ko read karne (fetching/searching) ka kaam zyada ho.
  Kyunki index se data turant mil jata hai.
  index se ham data get karte hai to O(1) time me ho jat hai.

=>Kahan use na karein:
 Jahan aapko beech mein (middle mein) baar-baar data add ya remove karna pade. 
 Kyunki beech mein element dalne par baaki ke sabhi elements ko aage/peeche shift karna padta hai, 
 jo performance slow kar deta hai (is case mein LinkedList behtar hoti hai).
 
 => Note :
    Target Address=Base Address + (Index * Size of Data Type).
    
    -Esi formula ko follow karke ArrayList hame O(1) time me data karke deta hai.
 */