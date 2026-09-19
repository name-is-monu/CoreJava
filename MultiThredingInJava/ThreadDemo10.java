package MultiThredingInJava;

class Car1 implements Runnable
{

	@Override
   	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" has entered parking lot..");
			Thread.sleep(4000);
			synchronized(this)
			{
			System.out.println(Thread.currentThread().getName()+" has entered into Car..");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has started to drive the car..");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has come back and parked the Car.");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}

public class ThreadDemo10
{

	public static void main(String[] args)
	{
		Car1 car=new Car1();
		
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

/*
 Es Code ko aur achha banate hai 
  Parking me Ramesh , suresh , dinesh thino thread ja skti hai koe problem nhi hoga 
  but Car ko thino ek sath nhi chala skti hai na hi ek sath darvaja khol skti hai
  na hi ek sath diver kare aake park kar skti hai kyu ki car ek hi hai.
  
  => To ham syncronized keyword ka use karke yekar dete hai ki parking me thino thread 
  jaye ko problem nhi hai . ok
 
 */
