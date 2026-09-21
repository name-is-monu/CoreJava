package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(110);
		nums.add(20);
		nums.add(150);
		nums.add(8);
		nums.add(100);
		System.out.println("Unsorted :"+nums);
	    Collections.sort(nums);
	    System.out.println("Sorted :"+nums);
	    
	    
	    System.out.println("**************************");
	    
	    ArrayList<String> names=new ArrayList<String>();
	    names.add("Rawan");
	    names.add("Ajay");
	    names.add("Amit");
	    names.add("Pawan");
	    names.add("Monu");
	    names.add("Rohan");
	    names.add("Golu");
	    System.out.println("Unsorted :"+names);
	    Collections.sort(names);
	    System.out.println("Sorted :"+names);

	}

}
/*Simpel Predefine classes sorting using Utility class Collections.sor() without  
  Comparable and Comparable They are Functional Interfaces
  
  Note : Ham dekh skte hai ki Pridefine class like Integer and String ke list ko ham 
  Collections.sort()
  se easily sort kar pa rhe hai bina kisi extra affert ke Integer Number ke based 
  par sort ho rah ahia jab ki String Lecico Grafically Sort ho rha hai.
 */