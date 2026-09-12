package LooseCoupling2;

public class SpringBootCourse implements Course
{
	@Override
	public Boolean ByTheCourse(Double amount)
	{
		
		if(amount ==7999)
		{
			System.out.println(" Spring Boot Course Purched ..");
			return true;
		}
		else
		{
		  System.out.println("Spring Boot  Course not Purched ..");
		  System.out.println("Please provide amount :"+7999);
		  return false;
		}
	}
}
