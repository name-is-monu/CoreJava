package oppsconcepts;


class Dog
{
	private int cost;
	private String name;
	private String color;
	
	public Dog() 
	{
		
	}
	
	public Dog(int cost , String name , String color)
	{
		this.cost=cost;
		this.name=name;
		this.color=color;
	}

	//Getters() & Setters(
	public int getCost() 
	{
		return cost;
	}

	public void setCost(int cost) 
	{
		this.cost = cost;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}
	
}

public class ConstructorInJava 
{
  public static void main(String[] args) 
  {
	 Dog d1=new Dog(50000, "Bura", "Brown");
	 Dog d2=new Dog(20000, "Teko", "Reddis");
	 Dog d3=new Dog(50000, "Bruno", "white");
	 
	 System.out.println(d1.getCost());
	 System.out.println(d1.getColor());
	 System.out.println(d1.getName());
	 
	 System.out.println("===========================");
	
	 System.out.println(d2.getCost());
	 System.out.println(d2.getColor());
	 System.out.println(d2.getName());
	 
	 System.out.println("===========================");
		
	 System.out.println(d3.getCost());
	 System.out.println(d3.getColor());
	 System.out.println(d3.getName());
  }
}

/*Hamne abhi dekha ki ham Instance variables jo ki private hai unme setter() se values ko set kar skte hai
  and getter() se values ko get kare skte hai but agar ham chahate hai ki object creation ke time 
  hi ham apne instance variables me values ko set kar sake to ham constructor ka use karte hai.
  
  => Note :
     Constructor ek special type ka method hai jo sirf aur sirf instance variables ko initialized 
     karne ke kaam aata hai at the object creation time .
     hamne es method (Constructor ) manually call nhi  karna padta hai  jab ham Object create karte hai 
     to ye auto magically call ho jata hai aur eske andar ha code execute ho jata hai.
    
    Constructor ka same name class name ke hota hai note ye ek special type method hai 
     jiska koe return type nahi hota hai even void bhi nhi but it as access specifiers 
     
     -> Note jitni bar ham ham object create karte hai utini bat ye automatically call hota hai
           har obejct ke liye alaga alaga 
               
 */