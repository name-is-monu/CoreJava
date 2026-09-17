package EnumInJava;


enum TrafficLight
{
	RED , YELLOW , GREEN;
	
}

public class EnumDemo2
{

	public static void main(String[] args)
	{
		TrafficLight light=TrafficLight.YELLOW;
		
		switch(light)
		{
		   case RED -> System.out.println("STOP");
		   case YELLOW -> System.out.println("Get Ready");
		   case GREEN -> System.out.println("Go");
		}

	}

}
