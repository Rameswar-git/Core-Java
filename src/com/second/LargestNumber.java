package com.second;

import java.util.Scanner;

/**
 * @author Rameswar Prasad Das
 *
 */
public class LargestNumber {

	public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Eneter 3 Number A,B,C Sequentially To find Largest Number ");
         System.out.println("Enter value for A");
         double A=scanner.nextDouble();
         System.out.println("Enter value for B");
         double B=scanner.nextDouble();
         System.out.println("Enter value for C");
         double C=scanner.nextDouble();
         double max=FindLargest(A,B,C);
         System.out.println("Maximam between A,B,C is "+max);
         scanner.close();
	}

	private static double FindLargest(double a, double b, double c) {
		 double large= a>b ? a : b;
		 large=large>c ? large:c;
		return large;
	}

}
