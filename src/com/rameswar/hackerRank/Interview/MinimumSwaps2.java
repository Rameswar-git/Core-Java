package com.rameswar.hackerRank.Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwaps2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = inpReader.nextInt();
		}
		int[] copy = arr.clone();
		Arrays.sort(arr);
		int minswap = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != copy[i]) {
				minswap++;
				for (int j = i+1; j < n; j++) {
					if (copy[i] == arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
				}
			}
		}
		System.out.println(minswap);
	}

}
