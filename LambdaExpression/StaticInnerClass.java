package LambdaExpression;

class A
{
  public void show()
  {
	  System.out.println("Show In A");
  }
  
  public static class B
  {
	  public void show()
	  {
		  System.out.println("show in B");
	  }
  }
}

public class StaticInnerClass
{
   public static void main(String[] args)
   {
	   A.B obj=new A.B();
	   obj.show();
   }
}
