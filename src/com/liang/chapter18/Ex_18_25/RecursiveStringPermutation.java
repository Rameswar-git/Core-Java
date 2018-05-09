package com.liang.chapter18.Ex_18_25;

import org.apache.commons.math3.util.ArithmeticUtils;

public class RecursiveStringPermutation {

	public static void main(String[] args) {
		
		RecPermutation("","ABCDE");
		
		//By using Factorial also it might Possibel
		
	   System.out.println(ArithmeticUtils.factorial(20));

	}

	private static void RecPermutation(String string, String string2) {
		int n=string2.length();
		if(n == 0) System.out.println(string);		
		else {
			for (int i = 0; i < n; i++) {
				RecPermutation(string+string2.charAt(i),string2.substring(0, i)+string2.substring(i+1, n));
			}
			
		}
	}

}
