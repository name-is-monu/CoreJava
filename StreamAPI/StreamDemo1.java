package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1
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
		
//		System.out.println(nums);
//		Collections.sort(nums);    //it will sort the original list 
//		System.out.println(nums);
		
		
		/*if we want to sort the list of nums without affecting original nums list we can use
		 Stream Api */

		System.out.println("Old List"+nums);
		
		Stream<Integer> stream1=nums.stream();
		Stream<Integer> sortedStream=stream1.sorted();  //id doen't change the original list 
		sortedStream.forEach((n)->System.out.print(n+" "));  
		System.out.println();
		
		System.out.println("Original List :"+nums);
	}

}

/*Note : Steam ek bar consume ho gaya to aage ham uspar code work perform nhi kar skte hai
  matalb ek bar jab Terminal operation uspar perform kar diya uske baad bubara uska use nhi kar skte hai
  yah sirf single use ke liye hota hai*/
