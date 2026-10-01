package CollectionInJava;

import java.util.ArrayList;

public class ArrayList2 
{
   public static void main(String[] args)
   {
	   ArrayList<Integer> list =new ArrayList<Integer>();
	    list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
//		 ArrayList<Integer> list1 =new ArrayList<Integer>();
//		    list1.add(100);
//			list1.add(200);
//			list1.add(300);
//			list1.add(400);
//			
//        System.out.println(list.addAll(list1)); //add other collection all data into list .
//        System.out.println(list);
		
		
		//----------------------------------
		/*get() method index leta hai aur us index par pade data ko deta hai , but Agar yesa index 
		
		de diya gaya ko list me present hi nhi hai to IndexOutOfBoundsException throw karta hai.*/
		
//		Integer i=list.get(3);
//		System.out.println(i);
		
		try
		{
			Integer i=list.get(100);
			System.out.println(i);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		
   }
}
