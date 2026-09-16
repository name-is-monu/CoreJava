package oppsconcepts;

class Animal{
	public void eat()
	{
		System.out.println("Animal eates");
	}
}
class Tiger extends Animal
{
	@Override
	public void eat() {
		System.out.println("Tiger Hunts and eat..");
	}
	
	public void sound()
	{
		System.out.println("Tiger Roar ..");
	}
}

public class CastingUPAndDown {

	public static void main(String[] args)
	{
		Animal animal=new Tiger();  //using Parrent class ref we can call only Inherited method and Override method of the parent (parent class ref and child class object called upcasting)
		animal.eat();
		//using the parent class ref and child class object we can achieved the polymorephism .
		
		//To call a Specialized method of the Child class we have to downcast the parent class ref
		
//		Tiger tiger=(Tiger) animal;
		
		((Tiger)animal).sound(); //we can also downcast like this .
//		tiger.eat();
//		tiger.sound();  //usnig child class ref we can call inherited methods , implemented method and child class specialized method but we can't achieve polymorefishm


	}

}
