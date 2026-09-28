package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo3 
{
	public static void main(String[] args)
	{
		List<String> strList=new ArrayList<String>();
		strList.add("Monu");
		strList.add("Ajay");
		strList.add("Pawan");
		strList.add("Abhishek");
		strList.add("Rohan");
		strList.add("Monu");
		strList.add("Ajay");
		
		System.out.println(strList);
		
		//Convert List to set using stream
		
		Set<String> setStr=strList.stream().collect(Collectors.toSet());
		System.out.println(setStr);
		
	
		
	}

}
