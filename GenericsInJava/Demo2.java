package GenericsInJava;

import java.util.ArrayList;

class Human
{
	
}
class Student extends Human
{
	
}
class Employee
{
	
}

public class Demo2 
{
   public static void main(String[] args)
   {
//	   ArrayList<Human> human=new ArrayList<Human>();
//	   ArrayList<Student> students=new ArrayList<Student>();
//	   human=students; //Compile Time Error 
	   
//	   ArrayList<?> list=new ArrayList<>();
//	   ArrayList<Student> liststd=new ArrayList<Student>();
//	   list=liststd; //acceptable
	   
	
	   //UpperBound 
	   
//	   ArrayList<? extends Human> humans=new ArrayList< Human>();
//	   ArrayList<Student> students=new ArrayList<Student>();
//	   humans=students; //acceptable
	   
//	   ArrayList<Object> ob=new ArrayList<Object>();
//	   humans=ob;// not -acceptable because of upperBound
	   
	   
	   
	   
	   //LowerBound 
	   
//	   ArrayList<Object> objects=new ArrayList<Object>();
//	   
//	   ArrayList<? super Human> humans=new ArrayList<Human>();
//	   humans=objects;//acceptable
//	   
//	   ArrayList<Student> students=new ArrayList<Student>();
//	   humans=students; //Compile Time Error because of LowerBound
	   
   }
}


/*
 * Generic -> ArrayList<T> list=new ArrayList<T>();
       -Object Creation time babate hai ki kis Data ke sath hame kaam karna hai.
   
 * WildCard Generic -> ArrayList<?> list =new ArrayList<?>();
     -Ham kisi bhi data type ke sath kaam kar skte hai . Jaise Uper Parrent List me child list ko
      assign kar poa rhe hai. jab ki Human List me ham Student List ko assign nahi kar pa rhe hai 
      ye compile time error de rha hai . Jab ki normal class me ham Parrent ke reference me 
      child ke object ko store kar skte hai "Upcasting" bolte hai. 
     
 * UpperBound Generic -> ArrayList<? extends Human> list=new ArrayList<? extends Human>();
      -Ese ham Upper bound Gerenic bolte hai . Yato ye human Accespt karega ya to ye 
        Human class ke child class ko accespt karega .
 
 * LowerBound Generic -> ArrayList<? super Human> list new ArrayList<? super Human>
        -LowerBound ye kahta hai ki Ya to mai Human luga ya to mai Human ka parent class
        luga bas. 
 */