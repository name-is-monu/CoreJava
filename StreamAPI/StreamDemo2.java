package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo2
{

	public static void main(String[] args)
	{
		List<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(100);
		nums.add(55);
		nums.add(60);
		nums.add(78);
		nums.add(20);
		
		//method chaining 
		
		System.out.println("Befaore Sorting ange maping list :"+nums);
		
		nums.stream().sorted().map((n)->n*2).forEach((n)->System.out.println(n)); //it doesn't change the original list
		
		System.out.println("Afert Sorting and mapping list :"+nums);

	}

}
