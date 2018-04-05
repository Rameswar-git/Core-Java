package com.practice;

import java.util.Scanner;

public class FactorialRecPractice {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The No to Find recusive factorial");
		int no=scanner.nextInt();
		int p=fact(no);
		System.out.println("factorial of "+no+" is "+p);
		scanner.close();

	}

	private static int fact(int no) {
		if(no == 0)
			return 1;
		else
			return no*=fact(no-1);
		
	}

}
