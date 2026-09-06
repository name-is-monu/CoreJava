package oppsconcepts;

public class MainMethodOverloding 
{ 
	public static void main(String[] args) 
	{
		System.out.println("main method with String[] agrs ");
		
		main(89.80);
		main(20, "Monu Kumar");
		main("Monu Kumar",20);
	}

	public static void main(String name , int age) 
	{
		System.out.println("main method with String name and age ");
	}
	
	public static void main(int age ,String name  ) 
	{
		System.out.println("main method with  age and String name ");
	}
	
	
	public static void main(double marks)  
	{
		System.out.println("main method with marks ");
	}
	
}

/*main method overload ho skta hai byt JVM sirf use method ko call karega jis method ke 
 argumnet me "String[] args" hota hai . baki sab method ko hame main method ke andar call karna padeg 
 manually.
 
 => java ke rule ke hisab se main metho ka overload hona sahi hai same name but diffrerent parameters
    
 => So if any one ask to you , main method can be overload yes 
 */