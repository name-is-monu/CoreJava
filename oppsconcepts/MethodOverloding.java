package oppsconcepts;

class AdditionCalc
{
	public int add(int num1 , int num2)
	{
		return num1+num2;
   }
	
	public int add(int num1 , int num2 , int num3)
	{
		return num1+num2+num3;
   }
	
	public int add(int num1 , int num2 , int num3 , int num4)
	{
		return num1+num2+num3+num4;
   }
	
	public double add(int num1 , double num2)
	{
		return num1+num2;
    }
	
	
	public double add(double num1 , double num2)
	{
		return num1+num2;
   }
	
	
	//just for fun Variable Arguments VarArgs
	
	public int addAll(int ...nums)
	{
		int sum=0;
		for(int num : nums)
		{
			sum+=num;
		}
		return sum;
	}
}
public class MethodOverloding 
{
	public static void main(String[] args)
	{
		AdditionCalc add=new AdditionCalc();
		double result=add.add(10, 30.5);
		System.out.println(result);
		
		//--------------------------------
		
		int sum=add.addAll(10 , 20 , 30 , 40 , 50 , 60 ); //we cann also pass array...
		System.out.println(sum);
	}

}


/*Method Overloading :-
     Esme ek hi class e multiple methods hote hai jina name same hota hai but enka parameters diffrenet 
     hota hai jisme parameters ka sequence ya length ya to diffrent data type hota hai but same name 
     but diffrents signatures .. 
 */