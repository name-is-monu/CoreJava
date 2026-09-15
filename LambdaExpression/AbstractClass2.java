package LambdaExpression;


abstract class Bird1
{
	public abstract void fly();
}

//class Pision1 extends Bird1
//{
//	@Override
//	public void fly()
//	{
//		System.out.println("Pision can fly in the sky ..");
//		
//	}
//}
public class AbstractClass2
{
  public static void main(String[] args)
  {
	  Bird1 duck=new Bird1()
	  {
		
		@Override
		public void fly()
		{
		  System.out.println("Duck can fly ..");	
			
		}
		
		public void swim()
		{
			System.out.println("Duck also can swim ..");
		}
	};
	
	duck.fly();
	
  }
}


/*Note: Agar Hame Bird class ke abstract method ko override karke implements karna hai to hame 
  es abstract class ko extends larna padega . Yahi bas rasta hai kyu ham abstract class ka object 
  nhi create kar skte hai nhi to oject se access kar lete . 
  
  => Note : Ham dekh skte hai ki sirf fly() method ko override karne ke liye hame seperate ek class
  banana pada hai esko ham anonymous class se bhi kar skte hai.
 */