package oppsconcepts.statickeyword;

class Test3
{
	private static int a ,b ,c;
  
    //static block use for initialized the static variables
	static
	{
		System.out.println("Static block of Test3 Class ");
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
	

}


public class Demo3
{
	private static String name;
	private static int age;
	
	static
	{
		System.out.println("static block of main method..");
		name="Monu kumar";
		age=20;
	}
	
	public static void main(String[] args) 
	{
		Test3.staticDisp();
		
	}
}

/*Output -> 
 
static block of main method..
Static block of Test3 Class 
a :10
b :20
c :30

  */

/*
  => note: Kya main method se pahale koe statements execute hoti hai .
  
      Yes -> static block Ha o static block jo main method ke andar hoti hai.
      kyu ki main method class public hoti hai and jis class me main method hota hai
      jvm usko hi pahale load karta hai aur class load hote hi statc block call ho jata hai
      agar other class me static block hai to o main method ke vale class ke load hone ke baad
      o calss load hoga then us class ka static block execute hoga ..
 */
