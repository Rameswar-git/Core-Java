package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TheGridSearch {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] RC = scanner.nextLine().split(" ");

			int R = Integer.parseInt(RC[0]);

			int C = Integer.parseInt(RC[1]);

			String[] grid = new String[R];

			for (int i = 0; i < R; i++) {
				String GItem = scanner.nextLine();
				grid[i] = GItem;
			}

			String[] rc = scanner.nextLine().split(" ");

			int r = Integer.parseInt(rc[0]);

			int c = Integer.parseInt(rc[1]);

			String[] subgrid = new String[r];

			for (int i = 0; i < r; i++) {
				String PItem = scanner.nextLine();
				subgrid[i] = PItem;
			}

			boolean found = false;
			outer: for (int i = 0; !found && i < R - r + 1; i++) { // iterates over "top rows" for the subgrid.
				for (int j = 0; !found && j < C - c + 1; j++) { // iterates over "left-cols" for the subgrid.
					if (subgrid[0].equals(grid[i].substring(j, j + c))) { // We've found a first row! so, let's check
																			// all the rows below
						found = true;
						for (int k = i + 1; found && k < r + i; k++) {
							found &= subgrid[k - i].equals(grid[k].substring(j, j + c));
						}
						if (found)
							break outer;
					}
				}
			}

			System.out.println(found ? "YES" : "NO");
		}
		scanner.close();
	}

}
