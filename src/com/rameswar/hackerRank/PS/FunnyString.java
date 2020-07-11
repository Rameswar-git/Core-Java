package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testCases = inpReader.nextInt();
		inpReader.nextLine();
		for (int t = 0; t < testCases; t++) {
			String str = inpReader.nextLine();
			boolean isFunny = true;
			for (int i = 0; i < str.length() - 1; i++) {
				if (Math.abs(str.charAt(i) - str.charAt(i + 1)) != Math
						.abs(str.charAt(str.length() - i - 1) - str.charAt(str.length() - i - 2))) {
					isFunny = false;
					break;
				}
			}
			System.out.println(isFunny ? "Funny" : "Not Funny");
		}
		inpReader.close();

	}

}
