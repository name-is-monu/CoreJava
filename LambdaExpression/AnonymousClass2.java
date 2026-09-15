package LambdaExpression;

import javax.sound.midi.Soundbank;

class Animal1
{
	public void eat()
	{
		System.out.println("Animal can eat ...");
	}
	
	public void sound()
	{
		System.out.println("Animal makes sounds ..");
	}
}

public class AnonymousClass2 
{
   public static void main(String[] args)
   {
	    Animal1 animal=new Animal1()
	    		{
	    	        @Override
	    	        public void eat()
	    	        {
	    	          System.out.println("Overridden methdo of Animal Class By Anonymous class..");
	    	        }
	    	        
	    	         @Override
	    	        public void sound()
	    	         {
	    	            System.out.println("Every animal has a specific sound ..");
	    	        } 
	    		};
	    		
	    		animal.eat();
	    		animal.sound();
    }
}

/*Note : Agar hamko ANimal class ke method ko use karn ahai to ya to ham esko ek aur class
  banake extends kar skte hai ya to ham other class me Animal class ka obeject bana ke use kar skte 
  hai eske method ko but dono tariko ke liye hame ek extra class banana hi pad rha hai
  jab ki hame bas Animal class ke methdo ko use karna hai . To eske liye ham anonymous class
  ka use kar skte hai .
  
  Note: ye similer ek class ki tarah hi hai esme ham class ki tarah kuchh bui kar skte hai .
 */