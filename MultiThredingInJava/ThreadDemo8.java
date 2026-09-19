package MultiThredingInJava;

import java.util.Scanner;

class Alpha4 implements Runnable {
	public void banking() {
		System.out.println("Banking statements printing startd  ..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter usernumber :");
		int un = sc.nextInt();
		System.out.println("Enter user password :");
		int up = sc.nextInt();
		System.out.println("User number :" + un);
		System.out.println("User password :" + up);
		System.out.println("Banking statements printing ended ..");
	}

	public void starPrinting() {
		System.out.println("Printing the Start ");
		for (int i = 0; i < 4; i++) {
			System.out.println("**");
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Star Printing ended ");
	}

	public void focus(){
		System.out.println("Important message ");
		for (int i = 0; i < 4; i++) {
			System.out.println("Focus is the key to mastar any skill");
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Important message ended  ");
	}

	@Override
	public void run()
	{
		Thread tName=Thread.currentThread();
		
		if(tName.equals("BANK"))
		{
			banking();
		}
		else if(tName.equals("STAR"))
		{
			starPrinting();
		}
		else
		{
			focus();
		}
		
	}
}

public class ThreadDemo8 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread execution started ..");

		Alpha4 a = new Alpha4();
		

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		
		t1.setName("BANK");
		t2.setName("STAR");
		t3.setName("FOCUS");
		
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
 * 
 * t1.join(); t2.join(); t3.join();
 * 
 * -> Join main Thread ko exection ko tab tak rok ke rakhega jab tak ye thino
 * thread t1,t2,t3 apna task complete na kar le.
 * 
 * -> t1.join() bolega main Thread tab tak ruko jab tak mai apna kaam karke
 * tunko fir se join n kar lu . vaise hi t2 , and t3 bolege to main thread jo
 * sabse pahate apna kam khatam kar le rha tha o ab sab thread ke execution hone
 * ane join() karne ke baad chalega
 * 
 */
