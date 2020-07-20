package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testcases = in.nextInt();
		in.nextLine();
		for (int i = 0; i < testcases; i++) {
			String s = in.nextLine();
			int len = s.length();
			if (len % 2 != 0) {
				System.out.println(-1);
				continue;
			}
			String s1 = s.substring(0, len / 2);
			String s2 = s.substring(len / 2, len);
			for (int j = 0; j < s1.length(); j++) {
				char c = s1.charAt(j);
				s2 = s2.replaceFirst(Character.toString(c), "");
			}
			System.out.println(s2.length());
		}
	}

}
