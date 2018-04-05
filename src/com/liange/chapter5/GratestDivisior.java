package com.liange.chapter5;

import java.util.Scanner;

public class GratestDivisior {

	public static void main(String[] args) {
//       Scanner scanner=new Scanner(System.in);
//       System.out.println("Enter 1 St  Number");
//       int n1=scanner.nextInt();
//       System.out.println("Enter 2 nd  Number");
//       int n2=scanner.nextInt();
//       int divisior=n1<n2 ? n1:n2;
//       int gratestdivisior=0;
//       while(gratestdivisior == 0){
//    	   for(int i=divisior;i>0;i--){
//    		   if(n1 % i == 0 && n2 % i == 0){
//    			   gratestdivisior=i;
//    			   break;
//    		   }
//    	   }
//       }
//       
//       System.out.println("Highest divisior is "+gratestdivisior);
		
//		 Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();

		// Make gcd to be the minimum of n1 and n2
		int gcd = n1 < n2 ? n1 : n2;

		// Find the greatest common divisor
		while (n1 % gcd != 0 || n2 % gcd != 0) {
			gcd--;
		}

		// Display result
		System.out.println("The greatest common divisor for " + n1 +
			" and " + n2 + " is " + gcd);
      
	}

}
