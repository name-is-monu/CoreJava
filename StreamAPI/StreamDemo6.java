package StreamAPI;

import java.lang.foreign.Linker.Option;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

class Student
{
   private int rollNo;
   private String name;
   private int age;
   private String sub;
   
   public Student() 
   {
	
   }
   
   public Student(int rollNo , String name , int age , String sub)
   {
	   this.rollNo=rollNo;
	   this.name=name;
	   this.age=age;
	   this.sub=sub;
   }

   public int getRollNo() {
	return rollNo;
   }

   public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
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

   public String getSub() {
	return sub;
   }

   public void setSub(String sub) {
	this.sub = sub;
   }

   @Override
   public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", sub=" + sub + "]";
   }
   
   
 
}

public class StreamDemo6
{

	public static void main(String[] args)
	{
	   Student[] students=new Student[5];
	  students[0]=new Student(101, "Monu Kumar", 20, "Java");
	  students[1]=new Student(103, "Ajay Kumar", 22, "Python");
	  students[2]=new Student(103, "Pawan Kumar", 19, "Python");
	  students[3]=new Student(104, "Abhishek Kumar",18, "Mern");
	  students[4]=new Student(105, "Sonal Kumari", 19, "ArthSatra");
	  
//	  long count=Arrays.stream(students).count();
//	  System.out.println("Total Students :"+count);
	  
//	  Stream<Student> data=Arrays.stream(students).distinct();
//	  System.out.println(data.count());        //Kitne alga data hai.
	  
//	  Stream<Student> matureStd=Arrays.stream(students).filter((std)->std.getAge()>=20);
//	  matureStd.forEach(std->System.out.println(std));  //it will filter the 20 and 20+ age students

	  
	  Optional<Student> std=Arrays.stream(students).max((n1 , n2)->n1.getAge()-n2.getAge());
	  System.out.println(std); //yah max age vale Student ko find karega .
	}

}
