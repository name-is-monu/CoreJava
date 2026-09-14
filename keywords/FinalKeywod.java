package keywords;

//final class Parent
//{
//	
//}

class Parent2
{
	public final void show()
	{
		System.out.println("This is final method of Parent2 class");
	}
}
class Child2 extends Parent2
{
	
}

public class FinalKeywod 
{

	public static void main(String[] args)
	{
		/*
		  Child2 child2=new Child2(); 
		  child2.show();
		  
		  => Note :Es Example se ham dekh skte hai ki hamne agar ham agar parent class ke 
		   final show() method ko child class me override nhi kar rhe hai to o inherit ho rha hai
		   matalab ham final methods can be inherited .
		   
		    => FinalKeyword2 file me dekhte hai agar final method ko override kare to kya hoga 
		        -> override means (method body ko change )
		 */
		
	}
}


/*final -:
      -final keyword ko ham class , variables , methods , par laag skte hai .
      -> Class par final keyword lagate hai to o class inherit nhai ki ja skti 
      -> agar ham kisi method par final keyword lagate hai to o inherit 
           to hogi but override nhi hogi .
          matalab we can use as inherited method but we can't change it's 
          implentations .
 */