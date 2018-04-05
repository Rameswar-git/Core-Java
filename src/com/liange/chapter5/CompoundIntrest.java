package com.liange.chapter5;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter The Principel::");
        double  principel=scanner.nextDouble();
        System.out.println("Enter The Rate Of Intrest");
        double intrest=scanner.nextDouble();
        System.out.println("Enter no of Months");
        double months=scanner.nextDouble();
        
        double calculatedintrest=intrest/1200;
        
//        double values=(1+calculatedintrest);
//        
//        double onemonthinstall=principel;
        
//        double calculatedvalue=onemonthinstall;
        
        for (int i = 1; i <= months; i++) {
        	principel=principel+(principel*calculatedintrest);
        	System.out.println("On "+ i +" Month  passbook Amount Become ::"+principel);
		}
        scanner.close();
 	}

}
