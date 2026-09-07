package ArrayInJava;

public class Demo8 
{
  public static void main(String[] args) 
  {
	String[] arr=new String[5];
	
	System.out.println(arr.getClass().getName());  //[Ljava.lang.String;
	
	System.out.println("***********************");
	
	int[] arr1=new int[5];
	System.out.println(arr1.getClass().getName());//[I
	
	System.out.println("***********************");
	
	int[][] arr2=new int[3][5];
	System.out.println(arr2.getClass().getName());//[[I
  }
}
