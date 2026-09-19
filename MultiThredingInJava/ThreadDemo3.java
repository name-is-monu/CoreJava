package MultiThredingInJava;

import java.util.Scanner;

public class ThreadDemo3
{
      public static void main(String[] args) throws InterruptedException
      {
    	       System.out.println("Application started ..");
    	       
    	       System.out.println("Banking statements printing startd  ..");
    	       Scanner sc=new Scanner(System.in);
    	       System.out.println("Enter usernumber :");
    	       int un=sc.nextInt();
    	       System.out.println("Enter user password :");
    	       int up=sc.nextInt();
    	       System.out.println("User number :"+un);
    	       System.out.println("User password :"+up);
    	       System.out.println("Banking statements printing ended ..");
    	       
    	       
    	       System.out.println("Printing the Start ");
    	       for(int i=0 ; i<4 ; i++)
    	       {
    	    	     System.out.println("**");
    	    	     Thread.sleep(3000);
    	       }
    	       
    	       System.out.println("Star Printing ended ");
    	       
    	       
    	       System.out.println("Important message ");
    	       for(int i=0 ; i<4 ; i++)
    	       {
    	    	     System.out.println("Focus is the key to mastar any skill");
    	    	     Thread.sleep(3000);
    	       }
        
    	       System.out.println("Important message ended  ");
    	       
    	       
    	       
    	       System.out.println("Application execution terminated ...");
		
	  }
}

/*Note : Ham dekh skte hai ki ek hi Thread en sabhi task ko Handle kar rhi hai jisse 
 program ek dusare par depend nahi hai fir bhi ek ek karke execute ho rhe hai kyu ki ek 
 hi thread main bari bari se sabhi tasko ko execute kar rhe hai 
 "ThreadDemo4" me ham es task ko multple thread bana ke execution ko independent and fast karege
 taki ek tasko ko dusare task ke execute hone ke liye wait na karna pade .
  */
