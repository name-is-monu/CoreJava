package PlayWithJava;

public class CurculerArray
{

	public static void main(String[] args)
	{
		//print 18 numbers
		int[] nums= {10 , 20 , 50 , 40 , 30 , 50 };
		
		for(int i=0 ; i<18 ; i++)
		{
			System.out.print(nums[i%nums.length]+" ");
		}

	}

}
