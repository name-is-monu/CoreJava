package ExceptionHandling;

public class ExceptionHandling2 
{
  public static void main(String[] args)throws InterruptedException
  {
	 System.out.println("Main Method execution Start ..");
	 
	 Thread.sleep(5000);
	 
	 System.out.println("Main method execution ends ..");
  }
}


/*Note : Throws keyword ka use Exception ko Duck karne keliye kiya jata hai .
    Matalab Throws caller ko ye warrning teta hai ki ye method jiko tum call kar he ho ye 
    Exception throw karega esko Handle karna padega ..
    Throws hamesa methdo signature ke sath use hota hai. jaise hamne upar kiya hai. 
    Note: Throws ke jariye ham Exception ko handle kar nhi skte ye sirf Exception ko Duck karne
    ke kaam aata hai Exception ko hame Handle try catch ka use karke ho karna padta hai..
    
    -> Es Code me ho ye rha hai ki Es main method ka caller JVM hai aur JVM Exception 
    Handle nhi karta Runtime Execution System ka use karke para karta hai ki Caller ne handle kiya 
    hai ya nhi agar nhi to ye DefaultException Handler ko bhej deta hai Jo Default Exception 
    ko print karke Application rash ho jato hai.
 */