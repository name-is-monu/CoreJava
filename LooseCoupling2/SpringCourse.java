package LooseCoupling2;

public class SpringCourse implements Course
{
	@Override
	public Boolean ByTheCourse(Double amount)
	{
		
		if(amount ==6999)
		{
			System.out.println(" Spring Course Purched ..");
			return true;
		}
		else
		{
		  System.out.println("Spring Course not Purched ..");
		  System.out.println("Please provide amount :"+6999);
		  return false;
		}
}
}
