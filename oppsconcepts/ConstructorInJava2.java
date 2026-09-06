package oppsconcepts;


class Dog1
{
	private int cost;
	private String name;
	private String color;
	
	public Dog1() 
	{
		super();       //Call na kiya jaye fir bhi default hota hai har constructor me ..
		System.out.println("No- Argument Constructor..");
	}
	
	public Dog1(int cost) 
	{
		this();                       //Yaha par super() call nhi hoga kyu hamne this() ka use kiay hai
		this.cost=cost;
		this.name="Chetak";
		this.color="lightRed";
		
		System.out.println("One- Argument Constructor..");
	}
	
	public Dog1(int cost , String name , String color)
	{
		                               //->Yaha default super() hai
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

public class ConstructorInJava2 
{
  public static void main(String[] args) 
  {
	 Dog1 d1=new Dog1(50000, "Bura", "Brown");
	
	 Dog1 d2=new Dog1(1500000);
	 System.out.println(d2.getCost() +" "+d2.getName()+" "+d2.getColor());
	 
	
  }
}

/*
    => Note ham likhe ya na likhe Constructor ke andar ka first statement hamesa "super()" method hota hai
     Agar likhte hai to thik hai agar nhi likhte hai to JVM default super() ko call kar deta hai 
     note -> Agar ham constructor me this keyword ka use karte hai to super() nhi rhe ga 
     note -> this() ho ya super() dono constructor ka hamesa fist line hote hai 
 */