package PlayWithJava;
class Java
{
	String cousrse;
			
	public Java() 
	{
		//super() bydefault
		System.out.println("Java Class Constructor ..");
	}
	
	public Java(String course)
	{
		this.cousrse=course;
		System.out.println("java Parameterized constructor ..."+course);
	}
}
class Spring extends Java
{
	public Spring()
	{
		//super() bydefault
		System.out.println("Spring Class Constructor ");
	}
	
	public Spring(String msg)
	{
		super(msg);
		System.out.println("Spring class Parameterized constructor ..");
	}
}

public class ThisAnsSuperMethods
{
	public static void main(String[] args)
	{
	   //Spring s=new Spring();
		Spring s=new Spring("Java Programming");
	}

}


/*Ham Jante hai ki this() current class ke constructor ko refer karega
 vaise hi super() parent class ke constructructor ko refer karta hai .
 jab ham ek parent class ko child class se extends karte hai
 to child class ka constructor bydafault ham likhe ya na likhe pernt class
 ke default constructor super() ko class karta hai ye constructor ki hamesa first line hoti hai
  note : jab ham apne class me koe constructor nhi banate hai to o byfault ek no-arguments 
  constructor bana deta hai . but agar ham koe consttuctor banate hai like 
  parameterized and non - parameterized khud se to default constructor nhi nhi bant ahai
   but ham likhe ya na lihe har constructor parent class ke no-arguments ya default constructor
   ko call karta hai bydefault agar ham super class ke parameterized constructor 
   ko call karna chahate hai to hamko super(parameter) with parameter pass karna padega 
   with matching paramters ke sath. 
 */