/**
 * 
 */
package com.first;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Rameswar Prasad Das
 *
 */
public class DatePrograme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
           Scanner scanner=new Scanner(System.in);
           System.out.println("Enter A Valid date between 1 to 31");
           int date=scanner.nextInt();
           System.out.println("Enter a valid Month between 1 to 12");
           int month=scanner.nextInt();
           if (month == 1 && date == 1 ) {
			System.out.println("Happy New Year "+Calendar.getInstance().get(Calendar.YEAR));
		}else if (month == 1 && date == 26) {
			System.out.println("Happy Republic Day");
		}else if (month == 8 && date == 15) {
			System.out.println("Happy Independence day");
		}else {
           System.out.println("Have a nice day");
		}
           scanner.close();
	}

}
