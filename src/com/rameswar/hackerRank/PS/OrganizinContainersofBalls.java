package com.rameswar.hackerRank.PS;

import java.util.Arrays;
import java.util.Scanner;

public class OrganizinContainersofBalls {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for (int i = 0; i < testCases; i++) {
			int n = scan.nextInt();
			int[][] table = new int[n][n];
			int[] rows = new int[n];
			int[] cols = new int[n];
			for (int row = 0; row < n; row++) {
				for (int col = 0; col < n; col++) {
					table[row][col] = scan.nextInt();
					rows[row] += table[row][col];
					cols[col] += table[row][col];
				}
			}
			Arrays.sort(rows);
			Arrays.sort(cols);
			String output = "Possible";
			for (int j = 0; j < n; j++) {
				if (rows[j] != cols[j]) {
					output = "Impossible";
				}
			}
			System.out.println(output);
		}
		scan.close();
	}
}
