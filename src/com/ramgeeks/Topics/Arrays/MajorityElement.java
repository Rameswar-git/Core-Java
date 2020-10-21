package com.ramgeeks.Topics.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://www.geeksforgeeks.org/majority-element/

public class MajorityElement {

//	public static void main(String[] args) throws FileNotFoundException {
//		Scanner scan = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
//		int testCases = scan.nextInt();
//		for (int t = 0; t < testCases; t++) {
//			int n = scan.nextInt();
//			int[] arr = new int[n];
//			for (int i = 0; i < n; i++) {
//				arr[i] = scan.nextInt();
//			}
//			boolean found = false;
//			HashMap<Integer, Integer> counts = new HashMap<>(arr.length);
//			for (int i = 0; i < arr.length; i++) {
//				if (counts.containsKey(arr[i])) {
//					int cnt = counts.get(arr[i]) + 1;
//					if(cnt > n/2) {
//						System.out.println(arr[i]);
//						found = true;
//						break;
//					}else {
//						counts.put(arr[i], cnt);
//					}
//				} else {
//					counts.put(arr[i], 1);
//				}
//			}
//			
//			if(!found)
//			 System.out.println(-1);
//		}
//	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testCases = scan.nextInt();
		for (int t = 0; t < testCases; t++) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			int candiDate = findCandidate(arr, n);
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == candiDate) {
					count++;
				}

			}
			if (count > n / 2) {
				System.out.println(candiDate);
			} else {
				System.out.println(-1);
			}
		}
	}

	private static int findCandidate(int[] arr, int n) {
		int count = 1, index = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[index])
				count++;
			else
				count--;
			if (count == 0) {
				index = i;
				count = 1;
			}
		}
		return arr[index];
	}

}
