package com.liang.chapter18.Ex_18_23;

import java.util.Scanner;

public class RecursiveBinatryTODecimal {
	
	private static int sum=0;

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter The Binary No");
		
		String no=scan.nextLine();
		
		System.out.println(" The Decimal is  "+Bin2Dec(no,0,no.length()-1));	
		
		scan.close();

	}

	private static int  Bin2Dec(String no, int i, int j) {
		
		sum+= Integer.parseInt(no.charAt(i)+"") * (int)Math.pow(2, j);
		
		if(j == 0) {
			return sum;
		}else {
			return Bin2Dec(no,i+1,j-1);
		}
		
		
	}

}
