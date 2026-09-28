package StreamAPI;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamDemo5
{

	public static void main(String[] args)
	{
		int[] marks= {90, 86 , 30 , 58 , 60 , 96 , 80 , 99};
		
//		IntStream baseMarks=Arrays.stream(marks).filter(mark->mark>=50);
//		baseMarks.forEach(n->System.out.println(n));
		
		OptionalInt max_mark=Arrays.stream(marks).max();
		System.out.println(max_mark.getAsInt());

	}

}
