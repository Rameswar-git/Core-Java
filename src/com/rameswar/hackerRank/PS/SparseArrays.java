package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = input.nextInt();
		HashMap<String, Integer> counts = new HashMap<>(n);
		input.nextLine();
		for (int i = 0; i < n; i++) {
			String key = input.nextLine();
			Integer value = counts.get(key);
			if (value != null) {
				counts.put(key, value + 1);
			} else {
				counts.put(key, 1);
			}
		}
		int q = input.nextInt();
		input.nextLine();
		for (int i = 0; i < q; i++) {
			System.out.println(counts.getOrDefault(input.nextLine(), 0));
		}
		input.close();
	}

}
