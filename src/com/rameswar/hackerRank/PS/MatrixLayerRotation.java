package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MatrixLayerRotation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpreader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int r = inpreader.nextInt();
		int c = inpreader.nextInt();
		int k = inpreader.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = inpreader.nextInt();
			}
		}
		rotate(arr, r, c, k, 0);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]).replaceAll("\\D+", " ").trim());
		}
		inpreader.close();
	}

	private static void rotate(int[][] arr, int r, int c, int k, int layer) {
		Queue<Integer> que = new LinkedList<>();
		for (int i = 0 + layer; i < c - layer - 1; i++) {
			que.add(arr[0 + layer][i]);
		}
		for (int i = 0 + layer; i < r - layer - 1; i++) {
			que.add(arr[i][c - 1 - layer]);
		}
		for (int i = c - 1 - layer; i > 0 + layer; i--) {
			que.add(arr[r - layer - 1][i]);
		}
		for (int i = r - 1 - layer; i > 0 + layer; i--) {
			que.add(arr[i][0 + layer]);
		}
		int shiftings = k;
		int iterations = 2 * (r - layer * 2) + 2 * (c - layer * 2) - 4;
		if (iterations > 0) {
			shiftings = k % iterations;
		}
		for (int i = 0; i < shiftings; i++) {
			int temp = que.poll();
			que.add(temp);
		}

		for (int i = 0 + layer; i < c - layer - 1; i++) {
			arr[0 + layer][i] = que.poll();
		}
		for (int i = 0 + layer; i < r - layer - 1; i++) {
			arr[i][c - 1 - layer] = que.poll();
		}
		for (int i = c - 1 - layer; i > 0 + layer; i--) {
			arr[r - layer - 1][i] = que.poll();
		}
		for (int i = r - 1 - layer; i > 0 + layer; i--) {
			arr[i][0 + layer] = que.poll();
		}
		if (layer < c / 2 - 1 && layer < r / 2 - 1) {
			layer++;
			rotate(arr, r, c, k, layer);
		}
	}

}
