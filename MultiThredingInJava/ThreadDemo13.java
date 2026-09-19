package MultiThredingInJava;

class MSWord extends Thread
{
	@Override
	public void run()
	{
		if(Thread.currentThread().getName().equals("TYPING"))
		{
			Typing();
		}
		else if(Thread.currentThread().getName().equals("SPELL"))
		{
			SpellChek();
		}
		else
		{
		  autoSave();	
		}
            
	}
	
	public void Typing()
	{
		try
		{
				for(int i=0 ; i<3 ; i++)
				{
					System.out.println("Typing ...");
					Thread.sleep(3000);
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void SpellChek()
	{
		try
		{
				for(;;)
				{
					System.out.println("Speling checking ...");
					Thread.sleep(3000);
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void autoSave()
	{
		try
		{
				for(;;)
				{
					System.out.println("Autosaving...");
					Thread.sleep(3000);
				}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ThreadDemo13
{

	public static void main(String[] args)
	{
		MSWord t1=new MSWord();
		MSWord t2=new MSWord();
		MSWord t3=new MSWord();
		
		t1.setName("TYPING");
		t2.setName("SPELL");
		t3.setName("SAVING");
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t2.setPriority(3); 
		t3.setPriority(4);
		
		t1.start();
		t2.start();
		t3.start();

	}

}


/*Demon Thread will execute the at the last of the primary thread :
 => Creating a Demon Thread we have to setDemo(true) and keet the 
 thread resource in the infinite loop :
 */