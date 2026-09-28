package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamDemo4
{

	public static void main(String[] args)
	{
		//we can use stream() at the array
		
//		int[] marks= {90, 86 , 30 , 58 , 60 , 96 , 80 , 99};
//		int[] marks= {90, 86 , 70 , 58 , 60 , 96 , 80 , 99};
//		
//	 boolean status=Arrays.stream(marks)
//		.allMatch((mark)->mark>=40);
//	 
//	 if(status)
//		 System.out.println("All Students Pass :");
//	 else
//		 System.out.println("Some got faield ..");
		
		
		//ye pure marks ka avarage return karega .
//		int[] marks= {90, 86 , 70 , 58 , 60 , 96 , 80 , 99};
//		
//		OptionalDouble double1=Arrays.stream(marks)
//		.average();
//		
//		System.out.println("Average of all Marks "+double1.getAsDouble());
		
		
		//Convert Primitive to Object using stream
		
		int[] marks= {90, 86 , 70 , 58 , 60 , 96 , 80 , 99};
		
		Stream<Integer> data=Arrays.stream(marks)
		.boxed();
		//System.out.println(data); //java.util.stream.IntPipeline$1@6b884d57 (Eska matlab hai ye Object hai )
           Iterator<Integer> itr=data.iterator();
           while(itr.hasNext())
           {
        	     System.out.print(itr.next()+" ");
           }
	}

}
