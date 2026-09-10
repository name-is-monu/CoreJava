package inheritanceinjava;


class Areoplane
{
	public void fly()
	{
		System.out.println("Plane can play");
	}
	
	public void landing()
	{
		System.out.println("Plane can landing");
	}
}
class CargoPlane extends Areoplane
{
	
}
class PassengerPlane extends Areoplane
{
	
}
public class Inheritance2 
{

	public static void main(String[] args) 
	{
		CargoPlane cp=new CargoPlane();
		cp.fly();
		cp.landing();

	}

}

/*Note : hamne sirf ek jagah methods banaya and jis bhi class ko same method ko jarurat hai
 o extends karke aaram se use kar skti hai 1 bar chahe 1 hajar bar koe problem nhi hai 
 esi ko code re-usebility bolte hai ..
 
 => Note : inheritance also provide IS_A relation -> like PasengerPlane is a Areoplane and CargoPlane is
 a Areoplane this is called is a relation ship...
 */
