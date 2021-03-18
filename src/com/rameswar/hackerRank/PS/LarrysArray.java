package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LarrysArray {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testcases = input.nextInt();
		while(testcases-->0) {
			int n = input.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = input.nextInt();
			}
			Sort(arr,n);
			System.out.println(arr[n - 1] > arr[n - 2] ? "YES" : "NO");
		}
		input.close();
	}

	private static void Sort(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n-2-1; j >=0; j--) {
				if(arr[j]>arr[j+1] || arr[j]>arr[j+2] ) {
					swap(arr,j);
				}
			}
		}
	}

	private static void swap(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = arr[j+2];
		arr[j+2] = temp;
	}

}
