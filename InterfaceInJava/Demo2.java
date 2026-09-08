package InterfaceInJava;

interface Alien
{
	public static void eat()
	{
		System.out.println("Every Alien can eat ..");
	}
	public void see();
	public void speak();
	
  public	 default void underStand()
  {
	  System.out.println("They can underStand to each other ..");
  }
  
  private void contains()
  {
	  System.out.println("This interface contains the Alien features ..");
  }
}
class person implements Alien
{

	
	public void see()
	{
		System.out.println("persion can see");
		
	}

	
	public void speak()
	{
	  System.out.println("persion can speak");	
		
	}
	
}

public class Demo2 
{
    public static void main(String[] args)
    {
		Alien alien=new person();
		alien.see();
		alien.speak();
		//Alien.eat(); hoskta hai 
		//alien.eat(); nahi ho skta hai 
		
		alien.underStand();
	}
}
/*
        Alien.eat(); hoskta hai 
		alien.eat(); nahi ho skta hai 
		
		- Jiska matalab hai ki interface me bana static method inherited nhi hota hai jaise ki 
		abstract and class me bana static method inherited hota th abut override nhi kiya ja skta tha 
		agar esko override karte hai to o method hidding hota hai 
		
		Note : Interface me bana static method na to inherit hoga na hi override .
		 interface ke andar static block bhi nhi hota hai .
		 aur eske andar default method ho skta hai jiske body ho skti hai jiske inherited and 
		 override bhi kita ja skt a hai.
		 
 */
