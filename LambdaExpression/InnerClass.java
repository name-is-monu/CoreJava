package LambdaExpression;

import LambdaExpression.Person.Phone;

class Person
{
	public void getDetails()
	{
		System.out.println("Persion can do anything ..");
	}
	
	class Phone
	{
	   public void life()
	   {
		   System.out.println("without Phone Person can't alive..");
	   }
	}
}

public class InnerClass 
{
    public static void main(String[] args)
    {
//		Person p=new Person();
//		p.getDetails();
		
		Person p2=new Person();
		Phone phone=p2.new Phone();
		phone.life();
	}
}
