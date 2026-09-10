package Polymorephism;

class Aeroplane
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
class CargoPlane extends Aeroplane
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
class Passenger extends Aeroplane
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
class FighterPlane extends Aeroplane
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


public class Demo1 
{
        public static void main(String[] args) 
        {
			
        	CargoPlane c=new CargoPlane();
            
            Passenger p=new Passenger();
            
            FighterPlane f=new FighterPlane();
            
            //-----------------------------
            Aeroplane ar;
            
            ar=c;
            ar.fly();
            ar.landing();
            
            System.out.println("-----------------------------------");
            
            ar=p;
            ar.fly();
            ar.landing();
            
            System.out.println("-----------------------------------");
            
            ar=f;
            ar.fly();
            ar.landing();
            
            System.out.println("-----------------------------------");
        	
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
