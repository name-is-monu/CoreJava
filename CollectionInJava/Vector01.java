package CollectionInJava;

import java.util.Enumeration;
import java.util.Vector;

public class Vector01 
{

	public static void main(String[] args)
	{
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(100);
		v.add(50);
		v.add(10);
		v.add(20);
		
//		System.out.println(v);
//		
//		System.out.println(v.capacity());//10
//		
		Enumeration<Integer> en=v.elements();
		
		while (en.hasMoreElements())
		{
			Integer integer=en.nextElement();
			System.out.println(integer);
			
		}
	}

}

/*Vector bhi ArrayList ki tarah Dynamic array hai.
  -Ye List interface ko implement karta ghai i aur iske andar bhi data contiguous memory (ek sath) store hota hai, isiliye 
  ismein bhi index ke zariye data access karne ka time O(1) hota hai.
  => ye bbilkul ArrayList ke Same hai but Vector and ArrayList me Kya antarah hai.
  
   1. Vector: Yeh Synchronized hota hai. Matlab, agar ek waqt par kai threads
(multi-threading environment mein) ek hi Vector ko access ya modify kar rahe hain, 
toh Java khud dhyan rakhta hai ki data corrupt na ho (ek time par ek hi thread kaam kar sake).

-Vector: Yeh Synchronized hota hai. Matlab, agar ek waqt par kai threads 
(multi-threading environment mein) ek hi Vector ko access ya modify kar rahe hain,
 toh Java khud dhyan rakhta hai ki data corrupt na ho (ek time par ek hi thread kaam kar sake).
 
 
=> B. Capacity Growth (Size kaise badhta hai?)
ArrayList: Jab ArrayList bhar jaati hai, toh yeh apni capacity ko 50% (1.5 times)
 badha deti hai (oldCapacity + oldCapacity / 2).

-Vector: Jab Vector bhar jaati hai, toh yeh apni capacity ko double (100% / 2 times)
 kar leti hai (oldCapacity * 2). (Halaanki constructor mein hum capacity
  increment ka custom size bhi de sakte hain).
  
  
 */