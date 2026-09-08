package InterfaceInJava;


 interface AnimalSkills
{
	public void fly();
	public void swim();
}
 
 class Duck implements AnimalSkills
 {

   //overriden methods
	public void fly()
	{
		System.out.println("Duk can be fly ..");
	}

	
	public void swim()
	{
		System.out.println("Duck can be swim..");
	}
	
	//specialized methods
	
	public void run()
	{
		System.out.println("Duck can run also");
	}
	 
 }
 
 class Fish implements AnimalSkills
 {

	
	public void fly()
	{
		
		System.out.println("Fush can't be fly..");
	}

	
	public void swim()
	{
		System.out.println("Fish can be swim ..");
		
	}
	 
 }

public class Demo1 
{
	public static void main(String[] args)
	{
		AnimalSkills animal = new Duck();
		animal.fly();
		animal.swim();
	  
//		 Duck duck=new Duck();
//		 duck=(Duck)animal;
//		 duck.run();
		
		if(animal instanceof Duck)
		{
			Duck duck=new Duck();
			 duck=(Duck)animal;
			 duck.run();
			
		}
		
		System.out.println("=======================");
		
		Fish fish=new Fish();
		animal=fish;
		animal.fly();
		animal.swim();
	}
    
}

/*interface : 
   - interface kisi bhi class ke liye blue print ka kaam karta hai , ye apne implemented class
   ko batata hai ki kya karna hai kaise karna hai ye nhi ye implemented class ko ki karna padta hai
   -interface ko uski implemented class implements keyword ka use karke uske method ko inherit and 
   override karti hai .
   -using inheritence java me ham Multiple inheritence achieved kar sakte hai
   -interface sir kisi other interface ko extends kar skta hai but kisi class ko extends nhi 
   kar skta hai.
   -interface ka ham object nhi bana skte hai na hi uske andar ham constructor bana skte hai
   jaisa hi ma abstract class me constructer baan skte the .
   -interface me ham statc block nhi bana skte hai aur interface me banane static method override 
   ya inherited nhi kiye ja skte hai .
   jabki ham abstrct class me statck block and static method ko inherite kar skte hai but override nhi kar skte 
   hai. interface me ham instance block nhi bana skte hai jabki ham abstarc class me bana sket hai
   
   -interface ke instance variables bydefault "public static final " hote hai aur methods 
    by default "public abstract" hote hai .
    -interface me ham default method bana skte hai jiski body ho skti hai and statc method bhi 
    and private method bhi .
    -> Using interface ham 100% abstraction achieved kar skte hai aur Run Time polymorephism 
        bhi (Parent class reference and call the overriding method)
   
 */