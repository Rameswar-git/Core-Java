package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NearlySortedArray {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int testCases = input.nextInt();
		while(testCases-- > 0) {
			int n = input.nextInt();
			int k = input.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = input.nextInt();
			}
	        for (int i = 1; i < arr.length; i++) {
				int j = i;
				int s = k;
				while(j > 0 && s > 0) {
					if(arr[j - 1] > arr[j]) {
						int temp = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = temp;
					}
					j--;
					s--;
				}
			}
	        System.out.println(Arrays.toString(arr).replaceAll("\\W+", " ").trim());
		}
		input.close();

	}

}
