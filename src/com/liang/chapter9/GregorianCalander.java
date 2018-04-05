package com.liang.chapter9;

import java.util.GregorianCalendar;

public class GregorianCalander {

	public static void main(String[] args) {
		GregorianCalendar calendar=new GregorianCalendar();
		System.out.println("Current Year is ::"+calendar.get(GregorianCalendar.DATE));
		System.out.println("Current Year is ::"+calendar.get(GregorianCalendar.MONTH));
		System.out.println("Current Year is ::"+calendar.get(GregorianCalendar.YEAR));
		System.out.println("*****************************");
		calendar.setTimeInMillis(1234567898765L);
		System.out.println("Current Year is ::"+calendar.get(GregorianCalendar.DATE));
		System.out.println("Current Year is ::"+calendar.get(GregorianCalendar.MONTH));
		System.out.println("Current Year is ::"+calendar.get(GregorianCalendar.YEAR));
 	}

}
