package StringInJava;

public class Demo3 {

	public static void main(String[] args)
	{
		// == double equal operator compares the obejct of String.
		
		String name1="Monu Kumar";
		String name2="Monu Kumar";
		System.out.println(name1==name2); //true because it will store in SCP 
		
		System.out.println("**************************");
		
		String name3=new String("Pawan");
		String name4=new String("Pawan");
	    System.out.println(name3==name4); //false beacuse it will store in the Heap
		

	}

}
