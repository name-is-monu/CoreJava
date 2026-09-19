package MultiThredingInJava;

public class ThreadDemo2
{

	public static void main(String[] args)
	{
		System.out.println("Application execution was started ..");
		
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		try
		{
		  Thread.sleep(3000);	
		}
		catch (InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("************************");
		
		thread.setName("masterThread");
		thread.setPriority(1);
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		
		System.out.println("Application execution was ended ..");


	}

}
