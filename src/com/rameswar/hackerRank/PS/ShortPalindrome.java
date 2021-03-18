package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShortPalindrome {

	static int mod = 1000 * 1000 * 1000 + 7;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int[] arr1 = new int[26];
		int[][] arr2 = new int[26][26];
		int[] arr3 = new int[26];
		String str = inpReader.nextLine();
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a';
			ans+=arr3[index];
			ans = ans % mod;
			for (int j = 0; j < 26; j++) {
				arr3[j] += arr2[j][index];
				arr3[j]%=mod;
			}
			for (int j = 0; j < 26; j++) {
				arr2[j][index] += arr1[j];
				arr2[j][index]%=mod;
			}
			arr1[index]++;
			arr1[index]%=mod;
		}
		System.out.println(ans);
		inpReader.close();
	}

}
