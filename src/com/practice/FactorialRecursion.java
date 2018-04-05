package com.practice;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the No to find factorial");
		int no=scanner.nextInt();
		int p=fact(no);
		System.out.println("Factorial is "+p);
		scanner.close();

	}

	private static int fact(int no) {
		if(no == 1)
			 return 1;
		else	 
		   return no*=fact(no-1);
		
	}

}
