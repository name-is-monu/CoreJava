package keywords;


class Parent
{
	int i=10;
	
	public void parentDemo()
	{
	   System.out.println("parent class methdo ");	
	}
	
}
class Child extends Parent
{
	int i=10;
	
	public void childDemo() 
	{
		System.out.println("child class"+i);
		super.parentDemo();
		System.out.println("parent class value :"+super.i);
	}
}

public class SuperDemo
{
	public static void main(String[] args)
	{
		Child child=new Child();
		child.childDemo();
	}

}
