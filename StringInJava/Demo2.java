package StringInJava;

public class Demo2 
{
  public static void main(String[] args)
  {
	  String name1="Monu Kumar";
	  String name2="Monu Kumar";
	  //equals() methods compare the Data of the String Object .
	  System.out.println(name1.equals(name2)); //true
	  
	  System.out.println("********************");
	  
	  String name3=new String("Pawan");
	  String name4=new String("Pawan");
	  
	  System.out.println(name3.equals(name4)); //true
	  
  }
}
