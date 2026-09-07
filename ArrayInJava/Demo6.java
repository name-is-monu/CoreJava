package ArrayInJava;

public class Demo6 
{
  public static void main(String[] args)
  {
	//access elements of 2d array
	  
	  int[][] arr= {{10,20,30,40},{50,60,70,80},{90,100,110,120}}; //3*4
	  
	  for(int i=0 ; i<arr.length ; i++)
	  {
		  for(int j=0 ; j<arr[i].length;j++)
		  {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
  }
}
