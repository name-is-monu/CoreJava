package DateAndTimeInJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class LocalDateAndTime2 
{
	public static void main(String[] args)
	{
		//age Calc
	  LocalDate current=LocalDate.now();
	  LocalDate dob=LocalDate.of(2005, 10, 06);
	   
	  Period period=Period.between(dob, current);
	  System.out.println("Years :"+period.getYears() +" , Months :"+period.getMonths()+" , Days :"+period.getDays());
	}

}
