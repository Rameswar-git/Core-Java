package com.rameswar.hackerRank.Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpecialStringAgain {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		inpReader.nextLine();
		String str = inpReader.nextLine();
		System.out.println(findPalindromeCount(str, n)+n);
		inpReader.close();

	}

	private static long findPalindromeCount(String str, int n) {
		long count = 0;
		for (int i = 0; i < str.length(); i++) {
			int upperindex = i + 1;
			int lowerindex = i - 1;
			while (upperindex < n && lowerindex >= 0 && str.charAt(upperindex) == str.charAt(lowerindex)
					&& str.charAt(lowerindex) == str.charAt(i-1)) {
					count++;
					upperindex++;
					lowerindex--;
			}
			upperindex = 1;
			while (i+upperindex < n && str.charAt(i+upperindex) == str.charAt(i)) {
				upperindex++;
			}
			count+=upperindex/2;
		}
		return count;
	}

}
