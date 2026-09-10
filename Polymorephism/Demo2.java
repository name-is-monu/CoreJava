package Polymorephism;

class Aeroplane1
{
	public void fly()
	{
		System.out.println("Plane can fly");
	}
	public void landing()
	{
		System.out.println("Plane can landing");
	}
	
}
class CargoPlane1 extends Aeroplane1
{
	public void fly()
	{
		System.out.println("CargoPlane can fly");
	}
	public void landing()
	{
		System.out.println("CargoPlane can landing");
	}
}
class Passenger1 extends Aeroplane1
{
	public void fly()
	{
		System.out.println("PassengerPlane can fly");
	}
	public void landing()
	{
		System.out.println("PassengerPlane can landing");
	}
}
class FighterPlane1 extends Aeroplane1
{
	public void fly()
	{
		System.out.println("FighterPlane can fly");
	}
	public void landing()
	{
		System.out.println("FighterPlane can landing");
	}
}

class AirPort
{
	public void callThem(Aeroplane1 ref) 
	{
		ref.fly();
		ref.landing();
		System.out.println("----------------");
	}
}

public class Demo2 
{
        public static void main(String[] args) 
        {
			
          	CargoPlane1 c=new CargoPlane1();
            
            Passenger1 p=new Passenger1();
            
            FighterPlane1 f=new FighterPlane1();
            
            //-----------------------------
           AirPort ar=new AirPort();
           ar.callThem(c);
           ar.callThem(p);
           ar.callThem(f);
        	
		}  
}

/*
  Note: Esko method overriding bolte hai kyu ham ham dekh skte hai ki
    ar reference variable se hamne har bar har child class ke overriden and inherited method ko call
    kiya hai .to garam ham upcasting follow karte hai tabhi run time polymorephism achieved hota hai
    agar ham child class ka object bana ke overriden method ko call karte to run tume polymorephism a
    acheved nhi hota hai.
    
    =>Note : Polymorephism Two Types se hi achieved kiya ja skta hai . 
           1.Parent Type Reference
           2.Method Overriding 
           
            En dono rules ko ham follow karte hai to run time polymorephism achieved hoga
    */
