package com.rameswar.hackerRank.Interview;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class SherlockandAnagrams {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Vicky\\Desktop\\input00.txt")));

		int t = ip(br.readLine());

		while (t-- > 0) {

			String inp = br.readLine();
			char a[] = inp.toCharArray();
			int n = a.length;

			int count[][] = new int[n * n][26];
			int k = 0;

			for (int i = 0; i < n; i++) {
				count[k++][a[i] - 'a'] = 1;
				for (int j = i + 1; j < n; j++) {
					count[k] = count[k - 1].clone();
					count[k][a[j] - 'a']++;
					k++;
				}
			}

			long ans = 0;
			for (int i = 0; i < k; i++) {
				for (int j = i + 1; j < k; j++) {
					if (compare(count[i], count[j]))
						ans++;
				}
			}

			System.out.println(ans);
		}


	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	private static boolean compare(int[] is, int[] is2) {
		for (int i = 0; i < 26; i++)
			if (is[i] != is2[i])
				return false;
		return true;
	}

	public static int ip(String s) {
		return Integer.parseInt(s);
	}
}
