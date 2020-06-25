package com.rameswar.hackerRank.PS;

import java.util.Scanner;

public class QueensAttack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int rQueen = in.nextInt();
		int cQueen = in.nextInt();
		int[] distances = new int[8];
		distances[0] = n - cQueen; // Right straight part
		distances[1] = rQueen - 1 < n - cQueen ? rQueen - 1 : n - cQueen; // right upper diagonal
		distances[2] = rQueen - 1; // upper staright part
		distances[3] = rQueen - 1 < cQueen - 1 ? rQueen - 1 : cQueen - 1; // left upper diagonal part
		distances[4] = cQueen - 1; //left straight
		distances[5] = cQueen - 1 < n - rQueen ? cQueen - 1 : n - rQueen; // left lower diagonal part
		distances[6] = n - rQueen; // lower staraight part
		distances[7] = n - cQueen < n - rQueen ? n - cQueen : n - rQueen; // right lower diagonal
		for (int a0 = 0; a0 < k; a0++) {
			int rObstacle = in.nextInt();
			int cObstacle = in.nextInt();
			if (rObstacle == rQueen) {
				if (cObstacle > cQueen) {
					int d = cObstacle - cQueen - 1;
					if (d < distances[0])
						distances[0] = d;
				} else {
					int d = cQueen - cObstacle - 1;
					if (d < distances[4])
						distances[4] = d;
				}
			} else if (cObstacle == cQueen) {
				if (rObstacle > rQueen) {
					int d = rObstacle - rQueen - 1;
					if (d < distances[6])
						distances[6] = d;
				} else {
					int d = rQueen - rObstacle - 1;
					if (d < distances[2])
						distances[2] = d;
				}
			} else if (rObstacle - rQueen == cObstacle - cQueen) {
				if (rObstacle > rQueen) {
					int d = rObstacle - rQueen - 1;
					if (d < distances[7])
						distances[7] = d;
				} else {
					int d = rQueen - rObstacle - 1;
					if (d < distances[3])
						distances[3] = d;
				}
			} else if (rObstacle - rQueen == cQueen - cObstacle) {
				if (rObstacle > rQueen) {
					int d = rObstacle - rQueen - 1;
					if (d < distances[5])
						distances[5] = d;
				} else {
					int d = rQueen - rObstacle - 1;
					if (d < distances[1])
						distances[1] = d;
				}
			}
		}
		int result = 0;
		for (int i = 0; i < distances.length; i++) {
			result += distances[i];
		}
		System.out.println(result);
	}

}
