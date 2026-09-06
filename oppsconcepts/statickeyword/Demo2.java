package oppsconcepts.statickeyword;

class Test2
{
	private static int a ,b ,c;
    private int x , y , z;
	
    //static block use for initialized the static variables
	static
	{
		System.out.println("Static block is executed");
		a=10;
		b=20;
		c=30;
	}
	
	public static void staticDisp()
	{
	   System.out.println("a :"+a);
	   System.out.println("b :"+b);
	   System.out.println("c :"+c);
	}
	
	//Java Instance block use to initialize the instance variable and it become the first statements of constructor means it execute the during the object creation before the constructor
	
	{
		x=40;
		y=50;
		z=70;
	}
	
	public Test2() 
	{
		// java instance block come to here ...
		System.out.println("Constructor Executed ");
	}
	
	public void nonStaticDisp()
	{
		System.out.println("x :"+x);
		   System.out.println("y :"+y);
		   System.out.println("z :"+z);
	}
}


public class Demo2
{
	public static void main(String[] args) 
	{
		Test2.staticDisp(); 
		
		Test2 test2=new Test2();
		test2.nonStaticDisp();
		
	//	System.out.println("Share static method with object ...");
		
//		test2.staticDisp();
	}
}

/*Test2.staticDisp() hamne class kiya to class Load hote hi static block ke jariye static variable ko
 heap me memory mil jayegi with value .. and static block class load hote hi call ho jata hai .
 then ham Test2.staticDisp() ko call kiya hai to ye easly execute hoga with values.
 => Note : static block pure class me sirf ek bar execute hota hai during class loading time 
   but static method har obejct ke liye shareable hota hai har object esko use kar skat hai.
 
 =>Java Instance block object create hota hai tab execuet hota hai o bhi constructor se pahale 
     instance block construtor ke andar ka pahala statmenet ban jata hai 
     jab ham object banate hai tab ye construtor usse pahale execute ho jaat hai aure instance variables 
     ko initialize kar deta hai fit ham Test2 ka obejct banake nonStaticDisp() method ko call karte hai to 
     value lilta hai .
     Note -> har bar Object banane ke liye ham Construter ka use karte hai
      like -> new Text() to instance block har bar har object ke liye execute hoga jab jabb ham Object 
      banaye ge .
 */
