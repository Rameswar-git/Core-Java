package com.rameswar.hackerRank.Interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MergeSortCountingInversions {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testCases = inpReader.nextInt();
		for (int t = 0; t < testCases; t++) {
			int n = inpReader.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = inpReader.nextInt();
			}
			int[] temp = new int[arr.length];
			System.out.println(ms(arr, temp, 0, arr.length - 1));
		}
		inpReader.close();

	}

	private static long ms(int[] arr, int[] temp, int start, int end) {
		long count = 0;
		if (end <= start)
			return 0;
		int mid = (start + end) / 2;
		count += ms(arr, temp, start, mid);
		count += ms(arr, temp, mid + 1, end);
		count += merge(arr, temp, start, mid, end);
		return count;
	}

	private static long merge(int[] arr, int[] temp, int start, int mid, int end) {
		long cnt = 0;
		for (int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}
		int l = start, r = mid + 1;
		for (int i = start; i <= end; i++) {
			if (l > mid) {
				arr[i] = temp[r++];
			}else if(r > end) {
				arr[i] = temp[l++];
			}else if (temp[r] < temp[l]) {
				arr[i] = temp[r++];
				cnt += (mid - l) + 1;
			} else {
				arr[i] = temp[l++];
			}
		}
		return cnt;
	}
}
