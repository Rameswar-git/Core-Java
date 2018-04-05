package com.test.programs;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class underwriti {

	public static void main(String[] args) throws ParseException {

		String Inception="20/05/2016";
		
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         
		 LocalDate startDate =  LocalDate.parse(Inception, formatter);
		 

		 
		 
		 int y = startDate.getMonthValue() < 3 ? startDate.getYear() - 1 : startDate.getYear();
		 
		 System.out.println("Financial Year : " + y + "-" + (y + 1));
		 
    }
}