package PlayWithJava;

class Student
{
	private int roll_no;
	private String name;
	private int age;
	private static String collage_name;
	
	static
	{
		collage_name="Indra Gandhi National Open Univercity";
		
		System.out.println("static block was executed ....");
	}
	
	
	public Student(int roll_no , String name , int age) 
	{
		this.roll_no=roll_no;
		this.name=name;
		this.age=age;
	}


	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
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


	public static String getCollage_name() {
		return collage_name;
	}
	
	
	
}

public class StaticBlock
{

	public static void main(String[] args)
	{
		Student student=new Student(101, "Monu Kumar", 20);
		System.out.println(student.getRoll_no());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(Student.getCollage_name());
		
		System.out.println("************************");
		
		Student student1=new Student(102, "Rahul Kumar", 19);
		System.out.println(student1.getRoll_no());
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(Student.getCollage_name());

	}

}

/*static{} block static varibale ko initialized karne ke liye use kiya jata hai.
  ye pure class em ek baar execute hota hai, sirf class Load hote time .
  class kaise bhi load ho jaise object create karte time , ya statc method class karte time ,
  ya using reflexion api ka use karke bas kahne ka ye matalb hai ki
  static block sirf class load hote time class hota hai constructor 
  se bhi pahale call hota hai .
  
  
  Note : han dekh skte hai ki staic block sirf ek bar execute ho rha hai aur jo hamne collage_name
  initialized kiya hai static block ka use karke o har object ke liye same hai .
  memory ki bachat bhi hota hai yese aur har object ke sath hamko collage name likhne ki jarurat 
  nhi hai jab same collage ke students ho to .
  
 */