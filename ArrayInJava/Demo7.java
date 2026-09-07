package ArrayInJava;

public class Demo7 
{
  public static void main(String[] args) 
  {
	 //accessing elements from Jagde array
	  
	  int[][] arr= {{10 ,20 },{30 , 40 , 50 , 60},{ 1 , 2 , 3 , 4 , 5 , 6 , 7}};
	  
	  for(int i=0 ; i<arr.length ; i++)
	  {
		  for(int j=0 ; j<arr[i].length; j++)
		  {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
  }
}
