package com.liang.chapter18.Ex_18_9;

public class StringRecursiveReverse {

	public static void main(String[] args) {
		reverseDisplay("abcd","abcd".length());
	}

	private static void reverseDisplay(String string, int i) {
         
          if (i > 0) {
			System.out.println(string.charAt(i-1));
			 reverseDisplay(string,i-1);
		 }
		
		
	}

}
