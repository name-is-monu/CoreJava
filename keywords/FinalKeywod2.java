package keywords;


class Parent3
{
	public final void show()
	{
		System.out.println("This is final method of Parent2 class");
	}
}
class Child3 extends Parent3
{
	//public final void show()
//	{
		//System.out.println("This is final method of Parent2 class");
//	}
}

public class FinalKeywod2 
{

	public static void main(String[] args)
	{
		
	}
}

/*Noet : method ko jaise hi ham override kar rhe hai ye compile time Error de rha hai 
 Matlab final method ko ham override nhi kar skte .
 Note :final method can be Inherited but can't be override same like static method 
 static method can be inherited but when we try to override static method it get's method hiding 
 
 => Aur ahar ham private method ki baate kare to ye n to Inherit ho skata hai na hi overide 
  matalb jab inherite hi nhi hoga to override kaise hoga  
 */

