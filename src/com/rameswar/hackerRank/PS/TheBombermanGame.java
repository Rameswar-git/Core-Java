package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TheBombermanGame {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		String[] rcn = scanner.nextLine().split(" ");
		int r = Integer.parseInt(rcn[0]);
		int c = Integer.parseInt(rcn[1]);
		int n = Integer.parseInt(rcn[2]);
		char[][] grid = new char[r][c];
		for (int i = 0; i < r; i++) {
			grid[i] = scanner.nextLine().toCharArray();
		}
		if (n % 2 == 0) {
			filler(grid, r, c);
		}
		if (n % 4 == 3) {
			reducer(grid, r, c);
		}
		if (n % 4 == 1 && n != 1) {
			reducer(grid, r, c);
			reducer(grid, r, c);
		}
		for (int i = 0; i < grid.length; i++) {
			System.out.println(new String(grid[i]));
		}
		scanner.close();
	}

	private static void reducer(char[][] grid, int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(grid[i][j] == 'O') {
					if(i-1>=0 && grid[i-1][j]!='O') grid[i-1][j] = '*';
					if(i+1<r && grid[i+1][j]!='O') grid[i+1][j] = '*';
					if(j-1>=0 && grid[i][j-1]!='O') grid[i][j-1] = '*';
					if(j+1<c && grid[i][j+1]!='O') grid[i][j+1] = '*';
				}
			}
		}
		
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if(grid[i][j] == '.') grid[i][j] = 'O';
				else if(grid[i][j] == 'O' || grid[i][j] == '*') grid[i][j] = '.';
			}
		}

	}

	private static void filler(char[][] grid, int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				grid[i][j] = 'O';
			}

		}
	}

}
