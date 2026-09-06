package oppsconcepts.statickeyword;

class Parent
{
   static	int i=10;
	
	public static void disp() 
	{
	   System.out.println("parent class static method .."+i);	
	}
}
class Child extends Parent
{
	static int i=20;
	public static void disp()   //Method hiding 
	{
	   System.out.println("child class static method .."+i);	
	}
}
public class Demo5 
{
	public static void main(String[] args)
	{
		Child child=new Child();
		child.disp();
		
		child.disp();
		
	}

}

/*Note : static method child class me inherit hota hai but agar ham usko override karna 
         chahenge to ko "method hiding" hoga kyu ki o static method parent class ka na 
         hoke child class ka specialized method hoga . kyu ki har static method apne class se 
         related hota hai 
         
         => Note : We can Inherit the static method But we Can't Override the static method ..
 */