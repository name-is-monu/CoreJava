package ArrayInJava;

class Student
{
	private int id ;
	private String name;
	private int age;
	private String course;
	
	public Student(int id, String name, int age, String course) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
	
}

public class Demo4 {

	public static void main(String[] args) 
	{
	   Student[] students=new Student[3];
	   students[0]=new Student(101,"Monu Kumar", 20, "BCA");
	   students[1]=new Student(102,"Rahul", 19, "BA");
	   students[2]=new Student(103,"Pawan Kumar", 22, "BSC");
	   
	   
	   for(Student std : students)
	   {
		   System.out.println(std);
	   }
	}

}


/*Non -Primitive DataType array 
    -> Student[] students=new Student[3]; 
    Smiler to primitive ki tarah hi create kar skte hai 
  Syntax =>   DataType[] variable=new DataType[size]
 */