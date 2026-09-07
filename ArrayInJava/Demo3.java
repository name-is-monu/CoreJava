package ArrayInJava;

public class Demo3 
{
	public static int[] reverseArray(int[] arr)
	{
		int n=arr.length;
		int left=0;
		int right=n-1;
		
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		return arr;
	}
	

  public static void main(String[] args)
  {
	  int[] array= {10 , 20 , 30 , 40 , 50 , 60 , 70};
	  int[] revArray=Demo3.reverseArray(array);
	 
	  for(int element : revArray)
	  {
		  System.out.print(element +" ");
	  }
	
   }
}
