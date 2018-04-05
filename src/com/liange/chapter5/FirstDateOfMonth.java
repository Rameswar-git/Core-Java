package com.liange.chapter5;

import java.time.LocalDate;
import java.util.Scanner;

public class FirstDateOfMonth {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the Year::");
		
		int year=scanner.nextInt();
         LocalDate  aDate=LocalDate.of(year, 1, 1);  
         
         System.out.println(aDate.getMonth()+" 1 "+aDate.getYear()+" is "+aDate.getDayOfWeek());
         
         for (int i = 1; i <= 12; i++) {
        	 LocalDate  onndate= aDate.plusMonths(i);
        	 System.out.println(onndate.getMonth()+" 1 "+onndate.getYear()+" is "+onndate.getDayOfWeek());
		} 
         scanner.close();
	}

}
