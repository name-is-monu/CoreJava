package PlayWithJava;

class A
{
	public A()
	{
		System.out.println("Constructor ..");
	}
	
	public void show()
	{
		System.out.println("Method of show ...");
	}
	
	public A getAGain()
	{
		return new A();
	}
}

public class AnnonymousObject
{

	public static void main(String[] args)
	{
	//	new A(); //Annonymous object we can use this varibale only one during the creation ..
	//	new A().show();
		
	//methods chaining ....
		
		boolean staus=new A().getAGain().equals(new A());
		System.out.println(staus);
		

	}

}
