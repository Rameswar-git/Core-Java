package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheLoveLetterMystery {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		inpReader.nextLine();
		int[] counts = new int[n];
		for (int i = 0; i < n; i++) {
			String s = inpReader.nextLine();
			int sum = 0;
			for (int j = 0; j < s.length() / 2; j++) {
				if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
					sum += Math.abs(s.charAt(s.length() - j - 1) - s.charAt(j));
				}
			}
			counts[i] = sum;
		}
		for (int i = 0; i < counts.length; i++) {
			System.out.println(counts[i]);
		}

	}
}
