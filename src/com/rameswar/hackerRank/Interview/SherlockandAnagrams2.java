package com.rameswar.hackerRank.Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SherlockandAnagrams2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		inpReader.nextLine();
		for (int i = 0; i < n; i++) {
			String s = inpReader.nextLine();
			HashMap<String, Integer> map = new HashMap<>();
			int count = 0;
			for (int j = 1; j <= s.length(); j++) {
				for (int j2 = 0; j2 < s.length(); j2++) {
					if (j2 + j <= s.length()) {
						char[] charArray = s.substring(j2, j2 + j).toCharArray();
						Arrays.sort(charArray);
						String str = new String(charArray);
						if (map.containsKey(str)) {
							map.put(str, map.get(str) + 1);
						} else {
							map.put(str, 1);
						}
					}
				}
			}
			for (int cnt : map.values()) {
				if (cnt >= 2) {
					if (cnt == 2) {
						count++;
					} else {
						int sum = 0;
						for (int j = cnt - 1; j > 0; j--) {
							sum += j;
						}
						count += sum;
					}
				}
			}

			System.out.println(count);
		}
		inpReader.close();
	}

}
