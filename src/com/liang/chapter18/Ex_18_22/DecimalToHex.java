package com.liang.chapter18.Ex_18_22;

import java.util.Scanner;

public class DecimalToHex {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter The No Print its  Hex ");
		
		int no=scan.nextInt();
		
		System.out.println(" The Hex No Of The Given Value is "+DeciamlHex(no,""));
	}

	private static String DeciamlHex(int no,String val) {
		String remainder=no%16 >=10?String.valueOf((char)('A'+(no%16) % 10)):String.valueOf(no%16);
		
		if(no / 16 == 0) {
			return remainder+val;
		}else {
			return DeciamlHex(no/16,remainder);
		}
		
	}
	}	
