package CollectionInJava;

import java.util.LinkedList;

public class LinkedList02
{

	public static void main(String[] args)
	{
		LinkedList<String> names=new LinkedList<String>();
		names.add("Ram");
		names.add("Rohan");
		names.add("Monu");
		names.add("Pawan");
		names.add("Ajay");
		
	//	names.get(10); //IndexOutOfBoundException
		
		System.out.println(names);
		names.add(3, "Kajal"); //insertion O(1)

		System.out.println(names);
	}

}
