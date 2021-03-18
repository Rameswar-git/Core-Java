package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class KnightLonaChessboard {
	public static class Point {
		int x;
		int y;
		int count;

		public Point(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int[][] result = knightlOnAChessboard(n);
		for (int i = 0; i < result.length; i++) {
			StringBuilder bld = new StringBuilder();
			for (int j = 0; j < result[0].length; j++) {
				bld.append(result[i][j] + " ");
			}
			System.out.println(bld.toString().trim());
			bld.setLength(0);
		}
	}

	private static int[][] knightlOnAChessboard(int n) {
		int[][] ans = new int[n - 1][n - 1];
		for (int r = 1; r < n; r++) {
			for (int c = 1; c < n; c++) {
				if (c < r) {
					ans[r - 1][c - 1] = ans[c - 1][r - 1];
				} else {
					ans[r - 1][c - 1] = bfsMove(r, c, n);
				}
			}
		}
		return ans;
	}

	private static int bfsMove(int r, int c, int n) {
		int[] x_moves = { -r, r, -r, r, -c, c, -c, c };
		int[] y_moves = { -c, c, c, -c, -r, r, r, -r };
		boolean[][] visited = new boolean[n][n];
		Queue<Point> pts = new LinkedList<>();
		pts.add(new Point(r, c, 1));
		while (!pts.isEmpty()) {
			Point pt = pts.poll();

			if (pt.x == n - 1 && pt.y == n - 1) {
				return pt.count;
			}
			for (int i = 0; i < 8; i++) {
				int x = pt.x;
				int y = pt.y;
				x = x + x_moves[i];
				y = y + y_moves[i];
				if (isValid(x, y, visited, n)) {
					Point nw_pnt = new Point(x, y, pt.count + 1);
					pts.add(nw_pnt);
					visited[x][y] = true;
				}
			}
		}
		return -1;
	}

	private static boolean isValid(int x, int y, boolean[][] visited, int n) {
		if (x >= 0 && y >= 0 && x < n && y < n && !visited[x][y])
			return true;
		return false;
	}
}
