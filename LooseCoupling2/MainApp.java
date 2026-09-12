package LooseCoupling2;

public class MainApp
{
  public static void main(String[] args)
  {
	
	  //DI perform using setter() method
//	  
//	  Telusko t=new Telusko();
//	  t.setCourse(new SpringBootCourse());
//	  Boolean status=t.coursePurched(7999.0);
//	  
//	  if(status)
//	  {
//		  System.out.println("Done !");
//	  }
//	  else
//	  {
//		  System.out.println("Field !");
//	  }
	  
	  
	  
	  //DI Using Constructor 
	  
	  Telusko telusko=new Telusko(new JavaCourse());
	  Boolean status=telusko.coursePurched(5999.0);
	  
	  if(status)
	  {
		  System.out.println("Done !");
	  }
	  else
	  {
		  System.out.println("Field !");
	  }
	  
  }
}


/*Note : Yaha Telusko Class Target Class bola jayega and jis bhi object ko ham pass  kar rhe hai 
  yani DI kar rhe hai Chahe setter() se ya Chahe Constructors se o object Dependent Obeject bola 
  jayega .
 */