package oppsconcepts;

class Demo1
{
	int num1;
	int num2;
	
	public Demo1() 
	{
		System.out.println("no-agrgument construtor ");
	}
	
	public Demo1(int num1) 
	{
		this();
		this.num1=num1;
		num2=44;
		System.out.println("one-agrgument construtor ");
	}
	
	public Demo1(int num1 ,int num2) 
	{
		this(num1);
		this.num1=num1;
		this.num2=num2;
		System.out.println("2-agrgument construtor ");
	}
	
	public void disp()
	{
		System.out.println(num1);
		System.out.println(num2);
	}
}

public class ConstructorInJava3 
{
  public static void main(String[] args) 
  {
     Demo1 demo1=new Demo1(10, 20);
     demo1.disp();
}
}
/*
    Constructor Chaining :- jab Ek Constructor ke andar ham dusre Constructor ko call karte hai
    usko ham Constructor Chaining bolte hai . eske liye ham this() method ka use karte hai..
 */