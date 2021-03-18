package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers2ndSolution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = inpReader.nextInt();
		}
		Arrays.sort(arr);
		int mindiff = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			mindiff = Math.min(mindiff, arr[i + 1] - arr[i]);
		}
		for (int i = 0; i < n - 1; i++) {
			if(arr[i+1]- arr[i] == mindiff) {
                System.out.print(arr[i] + " " + arr[i+1]+" ");
			}
		}
	}
}
