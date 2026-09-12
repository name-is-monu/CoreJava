package LooseCoupling2;

public class DevopsCourse implements Course
{
	@Override
	public Boolean ByTheCourse(Double amount)
	{
		
		if(amount ==4999)
		{
			System.out.println(" Devops Course Purched ..");
			return true;
		}
		else
		{
		  System.out.println("Devops Course not Purched ..");
		  System.out.println("Please provide amount :"+4999);
		  return false;
		}
	}

}
