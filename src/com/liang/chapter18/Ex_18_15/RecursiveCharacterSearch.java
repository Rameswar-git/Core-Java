package com.liang.chapter18.Ex_18_15;

public class RecursiveCharacterSearch {
	
	private static int count=0;
	

	public static void main(String[] args) {
		
		RecursiveCharacterSerarch("lollo",'l');
		
		System.out.println(" The Number Of Times l Repeated is "+count);
		
	}

	private static void RecursiveCharacterSerarch(String string, char c) {
		
		if(string.length() > 0) {
			if(string.charAt(string.length()-1) == c ) {
				count++;
			}
			RecursiveCharacterSerarch(string.substring(0, string.length()-1),c);
		}
		
	}

}
