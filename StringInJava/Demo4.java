package StringInJava;

public class Demo4 
{

	public static void main(String[] args)
	{
		String name="Monu Kumar";
		String name1=new String("Monu Kumar");
		System.out.println(name.equals(name1)); //true because equals() methods compare the object values
        System.out.println(name==name1); //false beacuse it compare the object and both object store in the Diffrent memory section(SCP & Heap)
        
	}

}
