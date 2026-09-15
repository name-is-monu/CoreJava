package LambdaExpression;

class Animal
{
	public void eat()
	{
		System.out.println("Animal can eat ...");
	}
}

public class AnonymousClass 
{
   public static void main(String[] args)
   {
	    Animal animal=new Animal()
	    		{
	    	        @Override
	    	        public void eat()
	    	        {
	    	          System.out.println("Overridden methdo of Animal Class By Anonymous class..");
	    	        }
	    		};
	    		
	    		animal.eat();
    }
}

/*Note : Agar hamko ANimal class ke method ko use karn ahai to ya to ham esko ek aur class
  banake extends kar skte hai ya to ham other class me Animal class ka obeject bana ke use kar skte 
  hai eske method ko but dono tariko ke liye hame ek extra class banana hi pad rha hai
  jab ki hame bas Animal class ke methdo ko use karna hai . To eske liye ham anonymous class
  ka use kar skte hai .
 */