package com.liange.chapter5;

import java.util.Scanner;

public class LoanSchedule {

	public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter The Principel Amount");
         int Principel=scanner.nextInt();
         System.out.println("Enter The Rate Of Intrest");
         double intrest=scanner.nextDouble();
         System.out.println("Enter The No  of  Years");
         int yearas=scanner.nextInt();
         
         double monthlyintrest=intrest / 1200;
         double monthlypayment=Principel * monthlyintrest/(1-(1/Math.pow(1+monthlyintrest, yearas*12)));
         double totalpayment=monthlypayment*(yearas*12);
         
         System.out.println(monthlypayment);
         System.out.println(totalpayment);
         
         double balance=Principel,interstvalue,principel;
         
         for (int i = 1; i <= (yearas * 12) ; i++) {
        	 interstvalue=balance*monthlyintrest;
			 principel=monthlypayment-interstvalue;
			balance=balance-principel;
			System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i, interstvalue,
					principel, balance);
		}
         
         scanner.close();  
	}

}
