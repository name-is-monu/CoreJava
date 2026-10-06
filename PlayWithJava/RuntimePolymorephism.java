package PlayWithJava;

class A1 {
	public int add(int a, int b) {
		return a + b;
	}

}

class B1 extends A1 {
	@Override
	public int add(int a, int b) {
		return a + b+5;
	}

}

class C1 extends A1 {
	@Override
	public int add(int a, int b) {
		return a + b+10;
	}

}

public class RuntimePolymorephism {

	public static void main(String[] args)
	{
		B1 b1=new B1();
		C1 c1=new C1();
		
		A1 a1=b1;
		int res1=a1.add(10, 20); //it will call the B1 class method ..
		System.out.println(res1);
		
		a1=c1;
	int 	res2=a1.add(30, 50);
	System.out.println(res2);
		
		
		/*Here we can see that ki A1 class ka hamne ek a1 reference varaible banay hai
		 Upactsing ka use karke usme kabhi b1 kabhi c1 ka object dalke unke override method 
		 ko call kar rhe hai eki ko polymorephism kahte hai 
		 ek ref variable a1 sabhi child class ke inherited and override method ko call kar rha
		 hai
		 */

	}

}

/*
 * we can achieved Runtime Polymorephism using inheritence and creating the
 * parent class ref variable and child class object and calling the overrided
 * method we can acheved polymorephism .
 * 
 * -> parent class ref variable se ham override methods and inherited methods
 * call kar skte hai but specialized (child class ka methods) nhi call kar sket
 * hai eske liye hame downcasting karna padega..
 */