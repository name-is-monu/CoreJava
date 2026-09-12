package LooseCoupling2;

public class Telusko 
{
  private Course course;
  
  public Telusko(Course course)
  {
	this.course=course;
  }
  
  public Telusko()
  {
  }

  public void setCourse(Course course)
  {
	this.course = course;
  }
  
  public Boolean coursePurched(Double amount)
  {
	  return course.ByTheCourse(amount);
  }
  
}
