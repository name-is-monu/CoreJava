package GenericsInJava;

class Generics <T>
{
	private T ref;
	
	public Generics(T ref)
	{
		this.ref=ref;
	}
	
	public void show()
	{
		System.out.println("Type of T is :"+ref.getClass().getName());
	}
	
	public T getRef()
	{
		return ref;
	}
}

public class Demo1 
{
    public static void main(String[] args)
    {
	    Generics<Integer> gen=new Generics<Integer>(44);	
	    gen.show();
	    System.out.println(gen.getRef());
	    
	    Generics<String> str=new Generics<String>("Monu Kumar");
	   System.out.println( str.getRef());
	    str.show();
	}
}

/*User Define Generics 
 Generics class me ham Object creationn time te batate hai ki ham kis Data type ke sath kaam karna chate 
 hai .
 */