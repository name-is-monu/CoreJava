package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
	private int id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
	

}

//implements Comparable Interface

class SortStudent implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2)
	{
		return s1.getAge() - s2.getAge();
	}


	
}

public class Demo2 
{
     public static void main(String[] args)
     {
    	 /*Sort Student type data Using Collections.sort() is not posible because
    	  compiler get's confuse . using which Student object intance varible we want
    	  perform sorting algorithm   -> So,Solve this type of Confusion 
    	  Comparable and Comparator comes into picture*/
    	 
    	 ArrayList<Student> stdList=new ArrayList<Student>();
    	 stdList.add(new Student(1,"Monu", 20, "BCA"));
    	 stdList.add(new Student(4,"Radha", 22, "BA"));
    	 stdList.add(new Student(5,"Kajal", 30, "BSC"));
    	 stdList.add(new Student(6,"Aray", 25, "BBA"));
    	 stdList.add(new Student(9,"Abhishek", 18, "Inter"));
    	 System.out.println("Unsortd :"+stdList);
    	// Collections.sort(stdList); //CompileTime Error 
    	 
    	 //------------------
//    	 SortStudent sortStd=new SortStudent();
//    	 Collections.sort(stdList,sortStd);
//    	 System.out.println("Sorted :"+stdList);
    	 
    	 //or Ham Direct Lamda Expression  bhi use kar skte hai.
    	 
    	 Collections.sort(stdList, (s1 , s2)-> s1.getName().compareTo(s2.getName())); //Sort basis fo Name 
    	 
    	 System.out.println(stdList);
		
	}
}


/*we can Implements the Functional Interface Suing Three Ways :
 1.By implements 
 2.Using Anonymous class
 3.Using Lambda Expression 
 
 */