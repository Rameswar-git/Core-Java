package com.rameswar.hackerRank.PS;

import java.util.Scanner;

public class AbsolutePermutation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		while (testCases-- > 0) {
			int N = input.nextInt();
			int K = input.nextInt();
			if (K != 0 && N % (K * 2) != 0) {
				System.out.println(-1);
				continue;
			}
			for (int i = 0; i < N; i++) {
				if(K == 0) System.out.print(i+1+" ");
				else if(((i/K) % 2) == 0) System.out.print(i+K+1+" ");
				else System.out.print(i-K+1+" ");
			}
			System.out.println();
		}
		input.close();
	}

}
