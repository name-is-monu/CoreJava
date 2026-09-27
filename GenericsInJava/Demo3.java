package GenericsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class GeneralPurpose
{
	public static void printData1(Iterable<?> itr)  //ye collection ke kisi bhi list ko accespt karega 
	{
		Iterator<?> listItr=itr.iterator();
		while(listItr.hasNext())
		{
			System.out.print(listItr.next()+" ");
		}
	}
	
	public static void printData2(Iterable<Integer> intItr) // Ye Sirf Unhi list ko accept karega jo Integer ki hogi
	{
		Iterator<Integer> listItr=intItr.iterator();
		while(listItr.hasNext())
		{
			System.out.print(listItr.next()+" ");
		}
	}
	
	
	public static void printData3(List<? extends Human> humans)    //UpperBound Ye Human List Accept karega Ya to Human ke child class ka List 
	{
		
	}
	
	
	public static void printData4(List<? super Human> humans) //LowerBound Ya to Human List accespt karega ya to perent class list of Human
	{
		
	}
}

public class Demo3
{

	public static void main(String[] args)
	{
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ajay");
		names.add("Monu");
		names.add("Rohan");
		names.add("Pawan");
		names.add("Abhishek");
		
	    GeneralPurpose.printData1(names);
	   // GeneralPurpose.printData2(names); Compile Time Error
	    
	    System.out.println("****************************");
	    
	    ArrayList<Integer> marks=new ArrayList<Integer>();
	    marks.add(96);
	    marks.add(70);
	    marks.add(82);
	    marks.add(99);
	    marks.add(50);
	    
	    GeneralPurpose.printData2(marks);
		

	}

}
