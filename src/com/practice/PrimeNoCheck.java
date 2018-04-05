package com.practice;

import java.util.Scanner;


public class PrimeNoCheck {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a nmber to check prime No");
		int no=scanner.nextInt();
		if(isprime(no)){
			System.out.println("the provided No is prime");
		}else{
			System.out.println("The Provided No is Not a prime No");
		}
		scanner.close();
	}
	private static boolean isprime(int no) {
		if (no <= 1) {
			return false;
		}
		
		for(int i=2;i <= Math.sqrt(no);i++){
			if (no % i == 0) {
				return false;
			}
		}
		return true;
	}

	
}
