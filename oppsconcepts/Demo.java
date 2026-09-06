package oppsconcepts;

class Stucent
{
	//fields
	int id;
	String name;
	int age;
	
	//methods
	public void playing()
	{
		System.out.println("Student is playing ...");
	}
	
	public void studying()
	{
		System.out.println("Student is studying...");
	}
}

public class Demo 
{
   public static void main(String[] args)
   {
	   Stucent st=new Stucent();
	   st.playing();
	   st.studying();
}
}

/*Class is a blue print for the object or we can say that class represent group of objects with has 
  smiler type fields and behavior 
  
  Example :
                Student -> object 
                /     \
              has      does -> eat() , run(), pay() etc 
               |
            id , name
            age etc 
              
              
       => we can create Object of any class using new keyword with constructor like -> new Student()
            and we can provide this object name of type student like -> Student st=new Student()
            after creating object st we can access every fields and methods of Student class.      
  */
