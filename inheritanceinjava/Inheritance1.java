package inheritanceinjava;

class Person
{
	String name;
	int age ;
	
	public void eat()
	{
		System.out.println("Human can eat ");
	}
	public void speak()
	{
		System.out.println("Human can speak");
	}
	public void run()
	{
		System.out.println("Human can run");
	}
	
	public void show() 
	{
	      System.out.println("name :"+name);
	      System.out.println("age :"+age);
	}
}

class Student extends Person
{
	
}

public class Inheritance1 
{
	public static void main(String[] args) 
	{
		Student student=new Student();
		student.name="Monu Kumar";
		student.age=20;
		
		student.eat();
		student.speak();
		student.run();
		student.show();
	}

}


/*Note : Hamne Student class me ek bhi Data member and member function nhi banaya hai but 
 fir bhi ham esko use kar pa rhe hai because of extends keyword ko parent class ke 
 properties and methods ko access and manipulate karne ko allow karta hai..*/
 