package DateAndTimeInJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateAndTime01 
{
	public static void main(String[] args)
	{
	   LocalDateTime current=LocalDateTime.now();
//	   System.out.println(current);
	   
	   //Formatter
	   DateTimeFormatter formatter=DateTimeFormatter.ISO_DATE; //2026-09-12
	   String formetedTime=current.format(formatter);
	   System.out.println(formetedTime);
	}

}
