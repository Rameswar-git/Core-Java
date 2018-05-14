package com.GeeksforGeeks.Interview.String;

//Not Working

public class LongestSubstring {

	public static void main(String[] args) {

		String str = "Ramectcattaswar";

		String longestpalindromestring = "";

		int n = str.length();

		while (n > 0) {
			
			for (int i = 0; i < str.length(); i++) {

				if(isPalindrome(str.substring(i, str.length()))) {
					if(longestpalindromestring.length() < str.substring(i, str.length()).length()) {
						longestpalindromestring=str.substring(i, str.length());
					}
				}
			}
			
			n--;

		}
		
		System.out.println(longestpalindromestring);
		
		

	}

	private static boolean isPalindrome(String substring) {
		System.out.println(new StringBuffer(substring).reverse().toString().equalsIgnoreCase(substring) ?true:false);
       return new StringBuffer(substring).reverse().toString().equals(substring) ?true:false;	
	}

}
