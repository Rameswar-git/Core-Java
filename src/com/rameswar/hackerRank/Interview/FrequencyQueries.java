package com.rameswar.hackerRank.Interview;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyQueries {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(System.in);
		int n = inpReader.nextInt();
		Map<Integer, Integer> counts = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int operation = inpReader.nextInt();
			switch (operation) {
			case 1:
				int inp = inpReader.nextInt();
				Integer val = counts.getOrDefault(inp, 0);
				counts.put(inp, val + 1);
				break;
			case 2:
				int rem = inpReader.nextInt();
				Integer valneg = counts.getOrDefault(rem, 0);
				if (valneg == 1) {
					counts.remove(rem);
				} else if (valneg > 1) {
					counts.put(rem, valneg - 1);
				}
				break;
			case 3:
				int find = inpReader.nextInt();
				if (find < n && counts.values().contains(find)) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			default:
				break;
			}
		}
		inpReader.close();
	}
}
