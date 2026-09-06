package oppsconcepts.statickeyword;

class Student
{
	private String name;
	private int age;
	
	private static int count;
	
	{
		count++;
		System.out.println("Object no :"+count);
	}
	
	public Student() 
	{
		
	}
	
	public Student(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
}

public class Demo4 
{
    public static void main(String[] args) 
    {
		Student s1=new Student();
		Student s2=new Student("Monu Kumar", 20);
		Student s3=new Student("Rahul", 10);
		Student s4=new Student("kajal", 18);
	}
}


/*Har Obejct ke liye same data hai to uske liye static ka use karte hai 
  but every object ke liye different data hai uske liye isntance ka use karte hai.
  
  Lets-> count the obejct how may crated..
  
  note -> we can use static variables in non static method or block but we can not
  use non- variables inside the static method or block  
 */