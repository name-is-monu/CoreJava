package oppsconcepts.statickeyword;

class Parent1
{
   static	int i=10;
	
	public static void disp() 
	{
	   System.out.println("parent class static method .."+i);	
	}
}
class Child1 extends Parent1
{
	static int i=20;
	public static void disp()   //Method hiding 
	{
	   System.out.println("child class static method .."+i);	
	}
}
public class Demo6 
{
	public static void main(String[] args)
	{
		/*
		  Parent1 p=new Child1(); 
		  p.disp();
		  Note: Ye Parrent Class ke static method ko call karega but gar vahi non-static method 
		     hota aur usko hamne override kiya hota to ye child class ke method ko call karta 
		     overrident method me case.
		 */
		
		/*
		  Child1 c=new Child1(); 
		  c.disp();
		 */
	}

}

/*Note : static method child class me inherit hota hai but agar ham usko override karna 
         chahenge to ko "method hiding" hoga kyu ki o static method parent class ka na 
         hoke child class ka specialized method hoga . kyu ki har static method apne class se 
         related hota hai 
         
         => Note : We can Inherit the static method But we Can't Override the static method ..
 */