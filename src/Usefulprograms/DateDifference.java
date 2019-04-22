package Usefulprograms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.Date;
import java.util.Locale;


public class DateDifference {

	public static void main(String[] args) throws ParseException {
		
		String date1="01/11/2017";
		String date2="05/10/2016";
		//Test
		
//		DateFormat df = new SimpleDateFormat("MM/dd/yyyy"); 
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 
//			TemporalAccessor startDate =  formatter.parse("31/10/2018");
//			TemporalAccessor endDate = formatter.parse("01/11/2017");
			
	
		 
		 LocalDate startDate =  LocalDate.parse("31/10/2018", formatter);
		 LocalDate endDate =  LocalDate.parse("01/11/2017", formatter);
		 
//		System.out.println(startDate.getDayOfMonth());
//		System.out.println(endDate.getDayOfYear());
		
			
			 LocalDate dateFrom = LocalDate.of(startDate.getYear(), startDate.getMonthValue(), startDate.getDayOfMonth());
//		 
			 LocalDate dateTo = LocalDate.of(endDate.getYear(), endDate.getMonthValue(), endDate.getDayOfMonth());
		
		
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
//		 Date endDate = df.parse(date1);
//		 Date startDate = df.parse(date2);
//		 String name=df.format(startDate);
//         System.out.println(name);
		 
		 
//		 LocalDate dateFrom = LocalDate.of(startDate.getYear(), startDate.getMonth(), startDate.getDate());
//		 LocalDate dateTo = LocalDate.of(endDate.getYear(), endDate.getMonth(), endDate.getDate());
//		 
//
//		 
//
//		  
			 
	    long diffInDays = ChronoUnit.DAYS.between(dateTo,dateFrom);
	    
	    System.out.println(diffInDays);
		 

		

	}

}
