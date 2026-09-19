package MultiThredingInJava;

public class ThreadDemo1
{

	public static void main(String[] args)
	{
		System.out.println("Application execution was started ..");

		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
	
		
		
		System.out.println("Application execution was ended ..");
	}

}
