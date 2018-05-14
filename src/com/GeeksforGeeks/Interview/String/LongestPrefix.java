package com.GeeksforGeeks.Interview.String;

import java.util.stream.IntStream;

public class LongestPrefix {

	public static void main(String[] args) {

		String[] names = { "geeksforgeeks", "geeks", "geek", "geezer" };
		String common = "";

		for (int i = 0; i < names.length-1 ; i++) {
			int n = 0;
			
			int len=names[i].length() > names[i + 1].length() ? names[i + 1].length():names[i].length();
			common="";
			while (len > 0) {
				if (names[i].charAt(n) == names[i + 1].charAt(n)) {
					common = common+names[i].charAt(n);
					n++;
					len--;
				} else {
					break;
				}

			}
		}
		
		System.out.println(common);

	}

}
