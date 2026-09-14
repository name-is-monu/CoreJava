package keywords;

abstract class Animal
{
	public abstract void eat();
	public abstract void sound();
}
class Dog extends Animal
{
//  	public void food()
//	{
//		System.out.println("Animal can't make food .they dipends on other things");
//	}
	
	static
	{
		System.out.println("Animal can't make food .they dipend on other things");
	}

	@Override
	public void eat()
	{
		System.out.println("Dog eats veg - and non-veg");
		
	}

	@Override
	public void sound()
	{
		System.out.println("Dog Barks ");
	}
	
}

class Tiger extends Animal
{

	@Override
	public void eat()
	{
		System.out.println("Tiger hunts and eat ");
		
	}

	@Override
	public void sound()
	{
		
		System.out.println("Tiger roar");
	}
	
}
public class AbstarctKeyword1
{

	public static void main(String[] args)
	{
		
           Dog dog=new Dog();
           Tiger tiger=new Tiger();
           
           //------------------------
           Animal animal=dog;
           animal.eat();
           animal.sound();
           
         System.out.println("-----------------");
         
         animal=tiger;
         animal.eat();
         animal.sound();
           
	}

}


/*abstract keyword ka use ham kisi class ko abstract banane ke liye karte hai 
 -jis class me abstract method goga use class ko hame abstract banana padega
 -abstract method ki body nahi hoti hai and abstract method ko final nahi bana skte 
 kyu ki enko banaya hi jata hai override hone ke liye and final method override nhi ho skte hai
 -abstract class ko bhi ham final nhi bana skte hai abstract class me concrete with body and abstract 
 without body bhi method ho skte hai agar us class me ek bhi method abstract hoga to class ko abstract 
 banana padega 
 -abstract class me constructor to bana skte hai but abstract class ka ham object nahi bana skte hai
 -jo bhi class ko abstract class ko extends karti hai ye must hota hai ki uske har abstract methods ko
 override kare agar o aisa nhi kati hai to usko bhi abstract hona padega 
 -abstract method ka object nhi bana skte kyu ko abstract class ko banaya jata hai run time 
 Polymorephism acheved karne ke liye means(Parent class reference variable and override the method of
 perent class in the child class)
 
 -Jaisa ki ham abstract class me constructor bana skte hai to o call bhi ho skte hai jab ham 
   abstract class ke implemented class ka object banate hai kyu ki jab ham child class 
   ka object banate hai to child class ka constructor bhi call hota hai same time aur child class
   ke constructor ka hamesa first statements super() method hota hai jo parent class ke constructor ko
   indicate karta hai.
   
   -abstract class se ham 100% abstraction achieved nhi kar skte hai .
   
   -> Note : abstract class me ham concrete method kyu banate hai -> Jab ham chahate hai ki har class
    ke liye koe yesi chij hai jo comman hai usko ham represent karne ke liye concrete method banate hai
    concrete class final ho skti hai metalab concrete class inherited ho skti hai but they can't 
    participate in overriding .metalab usko inherit kiya ja skta hai but inherit nahi 
    ya to eski jagah ham static blobk ka use kar skte hai jo har object ke liye same hoga ya static 
    method ka 
 */