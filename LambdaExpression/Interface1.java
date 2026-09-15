package LambdaExpression;

interface Bird2
{
	void fly();
	void swim();
}

public class Interface1 
{
  public static void main(String[] args)
  {
	  Bird2 duck=new Bird2()
			  {

				@Override
				public void fly() 
				{
					
					System.out.println("Duck can fly ..");
				}

				@Override
				public void swim()
				{
				 System.out.println("Duck can also swim ..");	
					
				}
		  
			  };
			  
			  duck.fly();
			  duck.swim();
	
 }
}


/*Note : Agar ham interface ke andar ke method ko implements karna chah rhe hai to 
  hame enko implements karke override karna padega eske liye bhi hame ek class bana padega 
  to ham yaha bhi Anonymous class ka use kar skte hai.
  
  => Note; Jis interface me 2 ya 2 se adhik abstract methods hota hai usko ham normal interface
  kahte hai espar ham Lambda Expression ka use nhi kar sket hai Ham Functional interface par Lambda Expression 
  ka use kar sket hai jise SAM -> Single Abstract Method bhi bola jata hai.
 */