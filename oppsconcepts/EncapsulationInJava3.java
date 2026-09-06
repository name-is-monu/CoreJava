package oppsconcepts;

class Student1
{
     private int id;
     private String name;
     private String city;
     
	 public int getId()
	 {
		 return id;
	 }
	 
	 public void setId(int id) 
	 {
		this.id = id;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 
	 public void setName(String name) 
	 {
		this.name = name;
	 }
	 
	 public String getCity() 
	 {
		 return city;
	 }
	 
	 public void setCity(String city)
	 {
		this.city = city;
	 }
     
     
}	
	
public class EncapsulationInJava3 
{
  public static void main(String[] args) 
  {
	
	 Student1 student=new Student1();
	 
	 student.setId(101);
	 student.setName("Monu Kumar");
	 student.setCity("Varanasi");
	 
	 int id=student.getId();
	 String name=student.getName();
	 String city=student.getCity();
	 
	 System.out.println(id); // 101
	 System.out.println(name); //Monu Kumar
	 System.out.println(city); //Varanasi
	
  }
}

/*
  Solve Problem of EncapsulationInJava2 file using this keyword
  
  => Solve Shadowing Problem 
 */
