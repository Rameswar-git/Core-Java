package com.rameswar.hackerRank.PS;

import java.io.File;
import java.util.Scanner;

public class StringConstruction {

	public static void main(String[] args) throws Exception {
		Scanner inpReadre = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testCases = inpReadre.nextInt();
		inpReadre.nextLine();
		for (int i = 0; i < testCases; i++) {
			String str = inpReadre.nextLine();
			int[] counts = new int[26];
			int costs = 0;
			for (int j = 0; j < str.length(); j++) {
				if (counts[str.charAt(j) - 'a'] == 0) {
					costs++;
				}
				counts[str.charAt(j) - 'a']++;
			}
			System.out.println(costs);
		}
		inpReadre.close();
	}

}
