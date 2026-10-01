package CollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 
{
  public static void main(String[] args)
  {
	  ArrayList<Integer> list =new ArrayList<Integer>();
	    list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(200);
		list.add(20);
		list.add(98);
		
	  
	  Iterator<Integer> itr=list.iterator();
	  while(itr.hasNext())
	  {
		  System.out.print(itr.next()+" ");
	  }
  }
}
