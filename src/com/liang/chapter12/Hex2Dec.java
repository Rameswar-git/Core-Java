package com.liang.chapter12;

import java.util.Scanner;

public class Hex2Dec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String To Convert To hex value");
		String hexx = sc.nextLine();
		try {
			double sdh=ConvertToHex(hexx.toUpperCase());
			System.out.println(sdh);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

	private static double ConvertToHex(String hexx) {
		double decimalval=0;
		for (int i = 0; i < hexx.length(); i++) {
			if ((hexx.charAt(i) >= '0' && hexx.charAt(i) <= '9') || (hexx.charAt(i) >= 'A' && hexx.charAt(i) <= 'F'))
				throw new NumberFormatException("String is not a hex string");
			char fx = hexx.charAt(i);
			decimalval=decimalval*16+hexchartoint(fx);
		}
		
		return decimalval;

	}

	private static double hexchartoint(char fx) {
		if (fx >='A' && fx <= 'F')
           return 10+fx-'A';
		else
		   return fx-'0';
	}
}
