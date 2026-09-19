package MultiThredingInJava;

import java.util.Scanner;

class Alpha extends Thread
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

class Beta extends Thread

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

class Gama extends Thread
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

public class ThreadDemo4
{

	public static void main(String[] args) throws InterruptedException
	{
		Alpha a=new Alpha();
		Beta b=new Beta();
		Gama g=new Gama();
		
//		a.banking();
//		b.starPrinting();
//		g.ImpMessage();
		
		a.start();
		b.start();  // it will provide live of thread .
		g.start();
	
	}

}

/*Java me ham Thread 2 types se create kar skte hai :-
  1.By extending the Thread Class 
  2.By implementing the Runnable interface 
  
  "ThreadDemo4 me dekhte hau Thread class ko extends karke ."
  => Runnable interface jo ki ek functional interface hai jisme sirf ek "run()"
  methods hai es Runnable interface ko Thread class extends kari hai bydefault 
  aur run() method ke andar ham use code ko likhte hai jisko ham chahate hai ki
  Thread execute kare .  
  
  => start() method ko hi call karn par thread create hota hai , ham directly run method ko 
  call nhi karet hai
 */
