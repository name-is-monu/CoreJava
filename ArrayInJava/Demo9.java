package ArrayInJava;

class Student1
{
	private int id;
	private String name;
	private int age;
	
	public Student1()
	{
		
	}
	
	public Student1(int id ,String name , int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void getData()
	{
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class Demo9
{

	public static void main(String[] args) 
	{
//		Student1[] students=new Student1[5];
//		System.out.println(students.getClass().getName()); //[LArrayInJava.Student1;
		
		
		//This is not a part of Array i'm just doing fun with java 
		
		Student1 std=new Student1(101 , "Marshal" , 20);
		std.getData();
		
		System.out.println("***************************");
		
		Class c=std.getClass();
		
		Student1 std2=null;
		try
		{
		  std2=(Student1)c.newInstance();    //for set the data into std2 we have to add default constructor
		  std2.setId(102);
		  std2.setName("Aman Gupta ");
		  std2.setAge(22);
		}
		catch (InstantiationException  | IllegalAccessException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(std ==std2); //false
		std2.getData();
	}

}
