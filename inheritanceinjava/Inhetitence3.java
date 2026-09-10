package inheritanceinjava;

class Parent
{
	public Parent()
	{
		System.out.println("Parent Class Constructor executed ...");
	}
}
class Child extends Parent
{
	public Child() 
	{
		//super();
	}
}

public class Inhetitence3 
{
	public static void main(String[] args) 
	{
		Child child=new Child(); 
		
	}

}

/*Note : inheritance me constructor inherite nahi hote hai. to eska javab hai nahi ab kaise samjhte hai->
         jab ham koe class banate hai to us class ke constructor ka bydefault first statements 
         super() methdo hota hai jo parrent class ke instance ko refer karta hai aur constructor 
         ko bhi agar hamne koe class ko extends nhi kiya hai to ye Obejct class ko refer karega .
         
         but agara Hamne kisi class ko extends kar diya to super() hamesa parrent class ke obejct 
          ke constructor ko refer karega aur hab ham child class ka object create karte hai to
          us class ka constructor automatically call ho jata hai aur super() use class ke
          constructor ka first statement hone ke karn pahale super call hota hai ... 
         
         
 */