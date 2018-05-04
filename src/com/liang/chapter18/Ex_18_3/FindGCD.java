package com.liang.chapter18.Ex_18_3;

import java.util.Scanner;

public class FindGCD {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter 2  Number To Find The Gcd :: ");
		int no1=scan.nextInt();
		int no2=scan.nextInt();
		int gc=Gcd(no1,no2);
		System.out.println(" The gratest Common Divisior of given 2 no is "+gc);
		scan.close();
	}

	private static int Gcd(int no1, int no2) {
		
		if(no1 % no2 == 0) {
			return no2;
		}else {
			return Gcd(no1, no1 % no2);
		}
		
		
	}

}
