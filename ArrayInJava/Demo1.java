package ArrayInJava;

public class Demo1 
{
  public static void main(String[] args) 
  {
	  //Declaration 
//	  int[] arr=new int[3];
//	  arr[0]=10;
//	  arr[1]=20;
//	  arr[2]=30;
	  
	  //Declaration & Initialization
	  int[] arr= {10 , 20 , 30 , 40};
	 
	for(int el : arr)
	{
		System.out.print(el +" ");
	}
  }
}
