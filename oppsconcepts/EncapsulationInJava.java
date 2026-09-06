package oppsconcepts;

class Book
{
     private int pageNumber;
     private String bookName;
     
     public void setPageNumber(int pgNumber)
     {
    	     if(pgNumber>=0)
    	     {
    	    	   pageNumber=pgNumber;
    	    	   System.out.println("Encapsulation present at page number"+pageNumber);
    	     }
    	     else
    	     {
    	    	   System.out.println("Provide non-zero page");
    	     }
    	     
     }
    	     public void setBooName(String bName)
    	     {
    	    	     if(bName.length()>=5)
    	    	     {
    	    	    	   bookName=bName;
    	    	     }
    	    	     else
    	    	     {
    	    	    	   System.out.println("Provide Long Title ..");
    	    	     }
    	    	     
    	    	     
    	    	     
     }


			 public String getBookName() {
				 return bookName;
			 }


			 public int getPageNumber() {
				 return pageNumber;
			 }
}	
	
public class EncapsulationInJava 
{
  public static void main(String[] args) 
  {
	 Book book= new Book();
//	 book.setPageNumber(-4);
//	 book.setBooName("java");
	 
	 book.setPageNumber(10);
	 book.setBooName("Java The Future");
	 
	 int page=book.getPageNumber();
	 String bookName=book.getBookName();
	 
	 System.out.println("Book name :"+bookName +" & we are present right now at page number :"+page);
  }
}


/*Encapsulation -:
       Encapsulation wrap the data and data members and members function within a single unit called 
       class . it also prevents the data or fields to UnAuthorize access to outside the class using 
       access specifiers like -> private -> according to requirements we can also provide
       this access specifiers (public , protected , private)
       
       => to set the values in fields form outside the class we 
       use setter() method 
       and to get the value form outside the class we use the getter() method 
       
       using setter() methods we can provide some validation on the fields 
       these are all power of Encapsulation 
       
        => including these all features Encapsulation is a most important part is the OPP
        
 */