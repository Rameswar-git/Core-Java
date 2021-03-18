package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MorganAndString {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testcases = inpReader.nextInt();
		inpReader.nextLine();
		for (int t = 0; t < testcases; t++) {
			String s1 = inpReader.nextLine();
			String s2 = inpReader.nextLine();
			int i = 0, j = 0;
			StringBuffer sb = new StringBuffer();
			while (i < s1.length() && j < s2.length()) {
				if (s1.charAt(i) < s2.charAt(j)) {
					sb.append(s1.charAt(i));
					i++;
				} else if (s1.charAt(i) > s2.charAt(j)) {
					sb.append(s2.charAt(j));
					j++;
				} else {
					char a = s1.charAt(i);
					int k = i, m = j;
					for (; k < s1.length() && m < s2.length(); k++, m++) {
						if (s1.charAt(k) != s2.charAt(m)) {
							break;
						} else if (s1.charAt(k) > a) {
							sb.append(s1.substring(i, k)).append(s2.substring(j, m));
							i = k;
							j = m;
							a = s1.charAt(k);
						}
					}
					if (k == s1.length()) {
						sb.append(s2.charAt(j));
						j++;
					} else if (m == s2.length()) {
						sb.append(s1.charAt(i));
						i++;
					} else {
						if (s1.charAt(k) < s2.charAt(m)) {
							sb.append(s1.charAt(i));
							i++;
						} else if (s1.charAt(k) > s2.charAt(m)) {
							sb.append(s2.charAt(j));
							j++;
						}
					}
				}
			}
			System.out.println(sb.append(s1.substring(i)).append(s2.substring(j)));
		}
		inpReader.close();
	}

}
