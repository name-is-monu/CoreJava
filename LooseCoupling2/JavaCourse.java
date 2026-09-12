package LooseCoupling2;

public class JavaCourse implements Course
{

	@Override
	public Boolean ByTheCourse(Double amount)
	{
		
		if(amount ==5999)
		{
			System.out.println(" Java Course Purched ..");
			return true;
		}
		else
		{
		  System.out.println("Java Course not Purched ..");
		  System.out.println("Please provide amount :"+5999);
		  return false;
		}
	}

}
