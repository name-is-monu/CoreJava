package MultiThredingInJava;

import java.util.Scanner;

class Alpha1 implements Runnable
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

class Beta1 implements Runnable

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

class Gama1 implements Runnable
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

public class ThreadDemo5
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main Thread Execution started ..");
		
		Runnable a=new Alpha1();
		Runnable b=new Beta1();
		Runnable g=new Gama1();
		
		Thread t1 =new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(g);
		
		t1.start();
		t2.start();
		t3.start();
		
  System.out.println("Main Thread Execution ended ");
	
	}

}

/*Java me ham Thread 2 types se create kar skte hai :-
  1.By extending the Thread Class 
  2.By implementing the Runnable interface 
  
  => Thread Creating usring Runnable interface :
      Runnable interface ko hamne implemnts karna padta hai fir uske method 
      run ko hamne override karna padta hai esme us code ko likhte hai jiko ham 
      chahte hai ki thread execute kare .
      
      fir Thread class ke constructor me ham Runnable interface ke fref ko ya to 
      ham jis class me Runnable interface ko impliments karke 
      uske run method ko override kiya hai uske object ko pass karte hai.
 */
