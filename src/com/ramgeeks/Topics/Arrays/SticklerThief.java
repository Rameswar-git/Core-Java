package com.ramgeeks.Topics.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SticklerThief {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testCases = inpReader.nextInt();
		for (int r = 0; r < testCases; r++) {
			int n = inpReader.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = inpReader.nextInt();
			}

			int incl = arr[0];
			int excl = 0;
			int excl_new;
			int i;

			for (i = 1; i < n; i++) {
				/* current max excluding i */
				excl_new = (incl > excl) ? incl : excl;

				/* current max including i */
				incl = excl + arr[i];
				excl = excl_new;
			}
			System.out.println((incl > excl) ? incl : excl);
		}
	}

}
