package MultiThredingInJava;

class Producer extends Thread
{
	
}

class Consumer extends Thread
{
	
}
class Queue
{
	
}

public class ThreadDemo14
{

	public static void main(String[] args)
	{
		Queue queue=new Queue();
		
		
		Producer producer=new Producer();
		Consumer consumer=new Consumer();
		
		producer.start();
		consumer.start();
		

	}

}

/*Producer and Consumer problem*/