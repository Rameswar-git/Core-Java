package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThreeDSurfaceArea {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		byte H = in.nextByte();
		byte W = in.nextByte();
		byte[][] A = new byte[H][W];

		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				A[i][j] = in.nextByte();
			}
		}

		int surfaceArea = 0;

		surfaceArea += H * W * 2; // floor, upper
		
		for (int i = 0; i < H; ++i) { // front, back
			surfaceArea += A[i][0];
			surfaceArea += A[i][W - 1];
		}

		for (int i = 0; i < W; ++i) { // left, right
			surfaceArea += A[0][i];
			surfaceArea += A[H - 1][i];
		}

		for (int r = 0; r < H; ++r) { // other exposed area
			for (int c = 0; c < W; ++c) {

				int[] x = { r - 1, r + 1, r, r };
				int[] y = { c, c, c - 1, c + 1 };

				for (int i = 0; i < x.length; ++i) {
					if (x[i] >= 0 && x[i] < H && y[i] >= 0 && y[i] < W) {
						surfaceArea += Math.max(0, A[r][c] - A[x[i]][y[i]]);
					}
				}
			}
		}

		System.out.println(surfaceArea);
		in.close();
	}
}
