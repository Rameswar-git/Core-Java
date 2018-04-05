package com.second;

import java.util.Scanner;
/**
 * @author Rameswar Prasad Das
 *
 */
public class GradeCalculation {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The valid Percentage From 1% to 100%");
        int percentage=scanner.nextInt();
        if (percentage>90) {
			System.out.println("Your Grade is A1");
		}else if (percentage>=85 && percentage<=90) {
			System.out.println("Your Grade is A2");
		}else if (percentage>=75 && percentage<85) {
			System.out.println("Your Grade is B1");
		}else if (percentage>=60 && percentage<75) {
			System.out.println("Your Grade is B2");
		}else if (percentage>=55 && percentage<60) {
			System.out.println("Your Grade is C1");
		}else if (percentage>=45 && percentage<55) {
			System.out.println("Your Grade is C2");
		}else if (percentage>=35 && percentage<45) {
			System.out.println("Your Grade is D1");
		}else if (percentage>=33 && percentage<35) {
			System.out.println("Your Grade is D2");
		}else {
			System.out.println("You are Failed in the exam");
		}
        scanner.close();
	}

}
