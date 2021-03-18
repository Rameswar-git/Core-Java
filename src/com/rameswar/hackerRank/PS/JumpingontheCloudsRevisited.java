package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JumpingontheCloudsRevisited {

	static int jumpingOnClouds(int[] c, int k) {
		int enrgy = 100;
		if(c[0] == 1) {
			enrgy-=2;
		}
		for (int i = 0;((i+k) % c.length) != 0 ; i+=k) {
			if(c[(i+k)%c.length] == 1) {
				enrgy-=2;
			}
			enrgy--;
		}
		return enrgy-1;
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}
		System.out.println(jumpingOnClouds(c, k));
		
		scanner.close();
	}

}
