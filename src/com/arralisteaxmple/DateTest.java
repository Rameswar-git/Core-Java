package com.arralisteaxmple;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTest {

	public static void main(String[] args) {
          String insdate="24/03/2017";
          String Acc_date="01/04/2017";
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          LocalDate dateTime = LocalDate.parse(insdate, formatter);
          LocalDate dateTime2 = LocalDate.parse(Acc_date, formatter);
          
//          boolean dt=dateTime.isBefore(dateTime2);
          
          if (dateTime.isBefore(dateTime2)) {
			System.out.println(dateTime2.format(formatter));
		   }else{
			   System.out.println(dateTime.format(formatter));
		   }
          
          
//          System.out.println(dateTime.format(formatter));
 
		
	}

}
