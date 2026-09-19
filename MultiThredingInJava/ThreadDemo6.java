package MultiThredingInJava;

import java.util.Scanner;

class Alpha2 implements Runnable
{
	public void banking()
	{
		 System.out.println("Banking statements printing startd  ..");
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter usernumber :");
	       int un=sc.nextInt();
	       System.out.println("Enter user password :");
	       int up=sc.nextInt();
	       System.out.println("User number :"+un);
	       System.out.println("User password :"+up);
	       System.out.println("Banking statements printing ended ..");
	}
	
	
	@Override
	public void run()
	{
	   this.banking();
	}
}

class Beta2 implements Runnable

{
	public void starPrinting() throws InterruptedException
	{
		 System.out.println("Printing the Start ");
	       for(int i=0 ; i<4 ; i++)
	       {
	    	     System.out.println("**");
	    	     Thread.sleep(3000);
	       }
	       
	       System.out.println("Star Printing ended ");
	}
	
	@Override
	public void run()
	{
	  try
	  {
		  this.starPrinting();
	  }
	  catch(InterruptedException e)
	  {
		  System.out.println(e.getMessage());
	  }
	}
}

class Gama2 implements Runnable
{
	public void ImpMessage() throws InterruptedException
	{
		 System.out.println("Important message ");
	       for(int i=0 ; i<4 ; i++)
	       {
	    	     System.out.println("Focus is the key to mastar any skill");
	    	     Thread.sleep(3000);
	       }
    
	       System.out.println("Important message ended  ");
	}
	
	@Override
	public void run()
	{
	  try
	  {
		  this.ImpMessage();
	  }
	  catch(InterruptedException e)
	  {
		  System.out.println(e.getMessage());
	  }
	}
}

public class ThreadDemo6
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main Thread execution started ..");
		
		Alpha2 a=new Alpha2();
		Beta2 b=new Beta2();
		Gama2 g=new Gama2();
		
		Thread t1 =new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(g);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
    System.out.println("Main Thread execution Ended ..");
	
	}

}

/*
 
        t1.join();
		t2.join();
		t3.join();
		
	-> Join main Thread ko exection ko tab tak rok ke rakhega jab tak ye 
	 thino thread t1,t2,t3 apna task complete na kar le.
	
		-> t1.join() bolega main Thread tab tak ruko jab tak mai apna kaam karke 
		tunko fir se join n kar lu .
		vaise hi t2 , and t3 bolege to main thread jo sabse pahate apna kam
		khatam kar le rha tha o ab sab thread ke execution hone ane join() karne ke baad 
		chalega
 
 */
