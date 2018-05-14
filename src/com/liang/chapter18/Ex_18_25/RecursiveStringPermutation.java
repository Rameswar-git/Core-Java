package com.liang.chapter18.Ex_18_25;


public class RecursiveStringPermutation {

	public static void main(String[] args) {
		
		RecPermutation("","ABC");
		
		//By using Factorial also it might Possibel
		

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
