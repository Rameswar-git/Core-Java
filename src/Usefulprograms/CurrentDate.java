package Usefulprograms;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		Date dTime = new Date();

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("E");
		SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss a");
		SimpleDateFormat sdf4 = new SimpleDateFormat("MMM");

		System.out.println("Current Date is: " + sdf1.format(dTime));
		System.out.println("Current Day is: " + sdf2.format(dTime));
		System.out.println("Current Time is: " + sdf3.format(dTime));
		System.out.println("Current Month is: " + sdf4.format(dTime));

		String date = "03/01/1991";

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMM");
		
               
		LocalDate parse = LocalDate.parse(date, format);
		
		System.out.println(parse.format(format2));

//		System.out.println(format2.format(temporal));

	}

}
