package com.test.programs;

import java.text.DecimalFormat;

public class htstr {

	public static void main(String[] args) {
		int i=1;
		DecimalFormat df = new DecimalFormat("00000");//00003

		System.out.println(df.format(i));
		
//		int s=Integer.valueOf(df.format(i));
//		
//		System.out.println(s);
		
	}

}
