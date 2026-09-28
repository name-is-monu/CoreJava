package StreamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

class Student1
{
   private int rollNo;
   private String name;
   private int age;
   private String sub;
   
   public Student1() 
   {
	
   }
   
   public Student1(int rollNo , String name , int age , String sub)
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

public class StreamDemo7
{

	public static void main(String[] args)
	{
	  ArrayList<Student1> students=new ArrayList<Student1>();
	  
	  students.add(new Student1(101, "Monu Kumar", 20, "Java"));
	  students.add(new Student1(103, "Ajay Kumar", 22, "Python"));
	  students.add(new Student1(103, "Pawan Kumar", 19, "Python"));
	  students.add(new Student1(104, "Abhishek Kumar",18, "Mern"));
	  students.add(new Student1(105, "Sonal Kumari", 19, "ArthSatra"));
	  
	  
	  //Sort the Student Data using Steam methods .
	  Stream<Student1> stdData=students.stream().sorted((std1 , std2)->std1.getName().compareTo(std2.getName()));
	  stdData.forEach(std->System.out.println(std));
	  
	}

}
