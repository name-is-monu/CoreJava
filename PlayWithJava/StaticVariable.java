package PlayWithJava;

import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;

class Mobile
{
	private String brand;
	private double cost;
	private static String name="SmartPhone";
	
	public Mobile() 
	{
		
	}
	
	public Mobile(String brand , double cost)
	{
		this.brand=brand;
		this.cost=cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String getName()
	{
		return Mobile.name;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", cost=" + cost +", Name ="+Mobile.name+"]";
	}
	
	
	
}

public class StaticVariable
{

	public static void main(String[] args)
	{
//		Mobile m1=new Mobile("Apple", 150000);
//		Mobile m2=new Mobile("Sumsung",120000); 
//		Mobile m3=new Mobile("Oppo", 50000);
//		Mobile m4=new Mobile("Vivo", 40000);
//		
//		System.out.println(m1);
//		System.out.println(m2);
//		System.out.println(m3);
//		System.out.println(m4);
		
		Mobile m1=new Mobile("Apple", 150000);
		System.out.println(m1.getBrand());
		System.out.println(m1.getCost());
		System.out.println(m1.getName());

	}

}

/*jab ham instance variables banate hai to ye har obejcts ke liye alag - alag 
  data sotore karte hai but ham chahte hai ek yesa variable ho jo har object ke 
  liye same ho aur har object ke liye shareable ho to ham static variable bana skte hai. 
  
  static variable refere to the class not the object we can access static variable 
  using method and class Name but we have to call the static things (varibale , method )
  using the Class Name .
 */