package com.tst.program2;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		System.out.println("Enetr the No upto which we need to print the factorial");
		Scanner scanner=new Scanner(System.in);
		int no=scanner.nextInt();

		int temp=1;
		int fact=1;
        for(int i=1;i<=no;i++){
        	fact=temp*i;
        	temp=fact;
        }
		System.out.println("Factorial Of "+no +" is::"+fact);
		
		scanner.close();

	}

}
