package LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Interface3 
{
	public static void main(String[] args)
	{
		//Return multiply of 5 an 2 something ..
		
		Function<Integer, Double> mul=(num)->
		{
			return (double) (num*2);
		};
		
		Double res=mul.apply(5);
		System.out.println(res);
		
		
		System.out.println("-----------------------------");
		
		//Print multiply of 5 an 2 something ..
		
		Consumer<Double> mul2=(num)->System.out.println(num*2);
		mul2.accept(5.6);
		
		System.out.println("-----------------------------");
		
		//return Square of 5 
		
		Supplier<Double> sqr=()->Math.sqrt(5);
		Double res1= sqr.get();
		System.out.println(res1);
		
		
		System.out.println("-----------------------------");
		
		//
		
		Predicate<Integer> isTrue=(num)-> num%2==0;
	   Boolean	res3=isTrue.test(20);
		if(res3)
		{
			System.out.println("Even numebr ..");
		}
		else
		{
		 System.out.println("Odd Number ..");	
		}
	}

}

/*Mainly Hamare pass 4 Typese Predifine Functional Interface Hoate Hai :-
  1.Functional Interface :-
        -> Take Something and return Something nature ka hota hai.
  2.Consumer Interface :-
         ->take Something return Nothing nature ka hota hai .
  3.Supplier Interface :-
        -> Take Nothing return Something nature ka hota hai.
  4.Predicate Interface :-
       -> Take Something Compare and return True/False nature ka hota hai.
       
                           
   => Note : Inhi Charo ke aur bahut type hote hai . jo different data par work karte hai
   and different type of Data retrun karte hai.
   
  => 90% work hamare enhi charo se ho jata hai bahut kam jarurat padta hai User Defien 
   Functional Interface banane ka ..
 */