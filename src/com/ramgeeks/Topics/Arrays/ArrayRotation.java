package com.ramgeeks.Topics.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testCases = inpReader.nextInt();
		for (int i = 0; i < testCases; i++) {
			int n = inpReader.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = inpReader.nextInt();
			}
			int rotations = inpReader.nextInt();
			for (int j = 0; j < rotations; j++) {
				int start = arr[0];
				for (int k = 1; k < arr.length; k++) {
					arr[k - 1] = arr[k];
				}
				arr[arr.length-1] = start;
			}
			System.out.println(Arrays.toString(arr).replaceAll("\\D+", " ").trim());
		}
	}

}
