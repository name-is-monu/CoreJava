package ArrayInJava;

public class Demo5 
{
  public static void main(String[] args)
  {
	  //array Declaration
	  
//	  int[] arr=new int[5];
	  
	  //array Declaration and Initialization
	  
	  int[] arr= {10 , 20 , 30 ,40 };
	  
	  int[] arr1=new int[] {10 , 20 , 30 , 40};
	  
	  //2d array
	  
	  int[][] arr2= {{10 , 20 , 30 },{40 , 50 , 60 }}; //2D NORMAL ARRAY
	  int[][] arr3= {{10 , 20 , 30},{40 , 50 , 60 ,70 , 80 }}; //2d Jaggde array
	  
	  //Declaration of 2 normal array and jaggde array
	  
	  int[][] arr4=new int[3][3];
	  int[][] arr5=new int[4][8]; //Normal array
	  
	  int[][] arr6=new int[3][];
	  arr6[0]=new int[4];
	  arr6[1]=new int[2];         //Declaration of Jaggde array .
	  arr6[2]=new int[8];
	  
	  
	      
  }
}
