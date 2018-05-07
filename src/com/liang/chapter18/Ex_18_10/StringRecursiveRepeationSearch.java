package com.liang.chapter18.Ex_18_10;

public class StringRecursiveRepeationSearch {
	
	static int ct=0;

	public static void main(String[] args) {
		
		
		System.out.println(count("Welcome", 'e'));



	}

	private static int count(String string, char c) {
		
	   if(string.length() == 1) {
		   ct= string.charAt(0) ==  c ? ++ct:ct;
	   }else {
		   ct= string.charAt(string.length()-1) ==  c ? ++ct:ct;
		   count(string.substring(0, string.length()-1),c);
	   }
		
		
		return ct;
	}

}
