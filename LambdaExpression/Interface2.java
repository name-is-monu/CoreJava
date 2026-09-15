package LambdaExpression;

interface Fish
{
	void swim();
}

public class Interface2 
{
  public static void main(String[] args)
  {
	  //Lambda Expression :
	  Fish dolphin=()->
	  {
		  System.out.println("Dolphin can be Swin very fast ..");
	  };
	  dolphin.swim();
	  
	
  }
}


/*Noet : Agar kisi interface me srif ek abstract methdo hai vaha ham inner class ka bhi use kar sket hai
  aur Lambda Expression ka bhi but Mostly Inner class ka use kiya jata hai kyu ye Lambda Expression
  ke jariye Ham Functional Programming Achieved kar skte hai.
 */