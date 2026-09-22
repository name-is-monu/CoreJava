package DateAndTimeInJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class LocalDateAndTime3 
{
	public static void main(String[] args)
	{
		LocalDateTime current=LocalDateTime.now();
//		LocalTime time=current.toLocalTime();
		LocalDate date=current.toLocalDate();
		System.out.println(date);
	}

}
