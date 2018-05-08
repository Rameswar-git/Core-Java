package com.liang.chapter18.Ex_18_16;

public class RecurSiveArrayUpperCaseSearch {
	
	private static int count=0;  

	public static void main(String[] args) {
		
		char[] chars= {'A','b','H','P','m','b','W'};
		
		FindUpperArray(chars,chars.length);
		
		System.out.println(count);
				
	}

	private static void FindUpperArray(char[] chars, int length) {
		
		if(length>0) {
			if(chars[length-1] >= 'A' && chars[length-1] <='Z' ) {
				count++;
			}
			FindUpperArray(chars,length-1);
		}
		
	}

}
