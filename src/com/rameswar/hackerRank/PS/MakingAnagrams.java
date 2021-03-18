package com.rameswar.hackerRank.PS;

import java.io.File;
import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String[] args) throws Exception {
		Scanner inpReadre = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		String str1 = inpReadre.nextLine();
		String str2 = inpReadre.nextLine();
		int[] counts1 = new int[26];
		int[] counts2 = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			counts1[str1.charAt(i) - 'a'] += 1;
		}
		for (int i = 0; i < str2.length(); i++) {
			counts2[str2.charAt(i) - 'a'] += 1;
		}
		int ans = 0;
		for (int i = 0; i < 26; i++) {
			ans += Math.abs(counts1[i] - counts2[i]);
		}
		inpReadre.close();
		System.out.println(ans);
	}

}
