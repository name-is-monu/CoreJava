package oppsconcepts;

class Student
{
     private int id;
     private String name;
     private String city;
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 name = name;
	 }
	 public String getCity() {
		 return city;
	 }
	 public void setCity(String city) {
		 city = city;
	 }
     
     
}	
	
public class EncapsulationInJava2 
{
  public static void main(String[] args) 
  {
	
	 Student student=new Student();
	 
	 student.setId(101);
	 student.setName("Monu Kumar");
	 student.setCity("Varanasi");
	 
	 int id=student.getId();
	 String name=student.getName();
	 String city=student.getCity();
	 
	 System.out.println(id); // 0
	 System.out.println(name); //null
	 System.out.println(city); //null
	
  }
}

/*Note hamne setter() method me instance variables ke bikul same name thiya hai local variables ko
 aur hamne this keyword ka use nhi kiya hai variable me values assign karne ke liye to ye 
 local variables me hi values ko assign kar dega na ki ye instance variable me values ko assign karega 
 because name jo parameter me pass hai o conflict karega to agara ham print karet hai instance variables ki
 values ko to o Data types ke based par default values ko print karega ,...
 
 => Note : Es conflicts ko dur karne ke liye ham this keyword ka use karet hai jisse local variables
 ki valuse sidhe instance variables me assign ho jata hai . note -> this keyword current class (jis class
 me use hota hai)use class ke object (Instance) ko refer karat hai. 
 
 => Note : Es problem ko "Shadowing Problem" bola jata hai jab local variables instance variables 
 me conflit hota hai aur Local Variable shadow kar deta hai instance varibles ko..
 */
