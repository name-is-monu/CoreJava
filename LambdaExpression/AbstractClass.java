package LambdaExpression;


abstract class Bird
{
	public abstract void fly();
}

class Pision extends Bird
{
	@Override
	public void fly()
	{
		System.out.println("Pision can fly in the sky ..");
		
	}
}
public class AbstractClass
{
  public static void main(String[] args)
  {
	Bird bird=new Pision();
	bird.fly();
  }
}


/*Note: Agar Hame Bird class ke abstract method ko override karke implements karna hai to hame 
  es abstract class ko extends larna padega . Yahi bas rasta hai kyu ham abstract class ka object 
  nhi create kar skte hai nhi to oject se access kar lete . 
  
  => Note : Ham dekh skte hai ki sirf fly() method ko override karne ke liye hame seperate ek class
  banana pada hai esko ham anonymous class se bhi kar skte hai.
 */