package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmasSuperComuter {

	public static class Point {
		public int x;
		public int y;
		public int length;

		public Point(int x, int y, int length) {
			this.x = x;
			this.y = y;
			this.length = length;
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int r = input.nextInt();
		int c = input.nextInt();
		char[][] board = new char[r][c];
		for (int i = 0; i < board.length; i++) {
			board[i] = input.next().toCharArray();
		}
		List<Point> points = new ArrayList<>();
		int has1pluses = 0;
		for (int i = 1; i < r - 1; ++i) {
			for (int j = 1; j < c - 1; ++j) {
				if (board[i][j] == 'G') {
					int x = 1;
					while (i - x >= 0 && i + x < r && j - x >= 0 && j + x < c) {
						if (board[i - x][j] == 'B' || board[i + x][j] == 'B' || board[i][j - x] == 'B'
								|| board[i][j + x] == 'B') {
							break;

						}
						++x;
					}
					if (x == 1 && has1pluses != 2) {
						points.add(new Point(i, j, 0));
						++has1pluses;
						continue;
					}
					for (int k = 1; k <= x - 1; ++k) {
						points.add(new Point(i, j, k));
					}
				}
			}
		}

		int maxArea = 0;
		for (int i = 0; i < points.size() - 1; ++i) {
			Point point1 = points.get(i);
			char[][] plusMarix = getPlusMarix(point1, r, c);
			for (int j = i + 1; j < points.size(); j++) {
				Point point2 = points.get(j);
				if (!isOverlaps(plusMarix, point2, r, c)) {
					int area1 = point1.length * 4 + 1;
					int area2 = point2.length * 4 + 1;
					if(area1 * area2 > maxArea) {
						maxArea = area1 * area2;
					}
				}
			}
		}

		System.out.println(maxArea != 0 ? maxArea : (points.size() != 0 ? 1 : 0));

	}

	private static boolean isOverlaps(char[][] plusMarix, Point point2, int r, int c) {
		for (int k = 1; k <= point2.length; k++) {
			if (plusMarix[point2.x - k][point2.y] == 1 || plusMarix[point2.x + k][point2.y] == 1
				|| plusMarix[point2.x][point2.y- k] == 1 || plusMarix[point2.x][point2.y + k] == 1) {
				return true;
			}
		}
		return false;
	}

	private static char[][] getPlusMarix(Point point, int r, int c) {
		char[][] newMatrix = new char[r][c];
		newMatrix[point.x][point.y] = 1;
		for (int i = 1; i <= point.length; ++i) {
			newMatrix[point.x + i][point.y] = 1;
			newMatrix[point.x - i][point.y] = 1;
			newMatrix[point.x][point.y + i] = 1;
			newMatrix[point.x][point.y - i] = 1;

		}
		return newMatrix;
	}

}