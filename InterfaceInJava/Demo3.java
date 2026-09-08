package InterfaceInJava;


interface Animal
{
	int age=20; //by default -> public static final int age=20 ; hoga 
//	static
//	{
//		//static block bhi nahi bana skte hai interface me 
//	}
//	
//	{
//		// java initialization  nhi bana skte interface me 
//	}
	
// public	Animal()
//	{
//		//construtor bhi nhi bana sket hai interface me 
//	}
	public void sound();   //public abstract method
	
	public default void eat()
	{
		System.out.println("All Dogs eats the meats ..");   //default method must have body
	}
	
	private void underStand()
	{
		System.out.println("Human can't underStand Animal Language .."); //private method use for specification interface
	}
	
	public static void communicate()  //static method can't be inherited and Overridden
	{
		System.out.println("Animal Can Communicates with eatch other ..");
	}
}
class Dog implements Animal
{

	
	public void sound()
	{
		System.out.println("Dog Barks ");
		
	}
	
}
public class Demo3
{
   public static void main(String[] args)
   {
	
   }
}

/*Java me Three Types ke interface hote hai -:
 1-> Marker interface :
       -jis interface me ek bhi abstract methdo nhi hota hai.
 2-> Functional interface :
      - jis interface me sirf ek abstract method hota hai ye using Lambda Expression function 
       interface suru karata hai java me 
 3-> Normal interface :
     -jis interface me more then two interface hote hai.            
 */
