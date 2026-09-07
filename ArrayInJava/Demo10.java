package ArrayInJava;

import java.util.Arrays;

public class Demo10
{
	public static void main(String[] args)
	{
	   int[] arr= {10 , 50 , 80 , 40 , 100};
	  
	   System.out.println("Before Sort ..");
	   for(int a :arr)
	   {
		   System.out.print(a+" ");
	   }
	   System.out.println();
	   Arrays.sort(arr);
	   System.out.println("**************");
	   
	   System.out.println("After Sort ..");
	   for(int a :arr)
	   {
		   System.out.print(a+" ");
	   }

	   System.out.println();
	   System.out.println("*************************");
	   
	   int[] nums= {10 , 20 , 30 , 40 , 50 };
	   int i=Arrays.binarySearch(nums, 90); //it will return index if not present it will provide -6
	   System.out.println(i);
	   
	   System.out.println();
	   System.out.println("*****************");
	   System.out.println("Before Array length ..");
	   System.out.println(nums.length);
	   int[] newNums=Arrays.copyOf(nums, 40);
	   System.out.println("After Array length ..");
	   System.out.println(newNums.length);       //old array ka Data present rahega ..
	   
	   System.out.println();
	   System.out.println("*******************");
	   for(int el :newNums)
	   {
		   System.out.print(el +" ");
	   }

	}

}


/*Note : Array ke Data par Manipulation karne ke liye Hamare pass Java dvara ek Arrays Name ka 
 Utility(Helper) class hai jiske sare methods statics hote hai . Eska use karke ham Array ke 
 Data par kuchh work perform kar skte hai . 
 */