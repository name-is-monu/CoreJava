package MultiThredingInJava;

class Car implements Runnable
{

	@Override
   synchronized	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" has entered parking lot..");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has entered into Car..");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has started to drive the car..");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has come back and parked the Car.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}

public class ThreadDemo9
{

	public static void main(String[] args)
	{
		Car car=new Car();
		
		Thread t1=new Thread(car);
		Thread t2=new Thread(car);
		Thread t3=new Thread(car);
		
		t1.setName("RAMESH");
		t2.setName("SURESH");
		t3.setName("DINESH");
		
		t1.start();
		t2.start();
		t3.start();

	}
}

/*Han Dekh skte hai ki buna "syncronized" keyword ke multiple thread same time me 
 ek hi resource ko use kar rhi hai jisse output galat aa rha hai kyu ko thino thred same 
 time par parking me ja rhi hai same time par car ko chala rhi hai jo ki galat hai esak propert 
 output pane ke liye ham "syncronized" keyword ka use karte hai.
 
 => Note : syncronized keyword ke baad jo Thread pahale enter kar rhi hai o Thread 
 parking , car mme enter then drive then parking me karne dead ho ja rhi hai then 
 agali thread jo jarhi hai o pura kaam kar le rhi hai tabhi agali thread ki bari aa rhi hai
 
 "Esko ham Race condition ko handle karna kaha jata hai."
 
 */
