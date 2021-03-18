package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BearAndSteadyGene {

	private static int n;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		n = scanner.nextInt();
		String s = scanner.next();
		Map<Character, Integer> map = new HashMap<>();
		map.put('A', 0);
		map.put('C', 0);
		map.put('G', 0);
		map.put('T', 0);
		for (Character c : s.toCharArray())
			map.put(c, map.get(c) + 1);

		int left = 0, right = 0, min = Integer.MAX_VALUE;
		while (right < n - 1) {
			char rc = s.charAt(right++);
			map.put(rc, map.get(rc) - 1);
			while (isSteady(map)) {
				min = Math.min(min, right - left);
				char lc = s.charAt(left++);
				map.put(lc, map.get(lc) + 1);
			}
		}
		System.out.println(min);
	}

	private static boolean isSteady(Map<Character, Integer> map) {
		for (Integer i : map.values())
			if (i > n / 4)
				return false;
		return true;
	}
}