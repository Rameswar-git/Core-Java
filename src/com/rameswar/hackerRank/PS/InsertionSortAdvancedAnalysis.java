package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsertionSortAdvancedAnalysis {
	private static long merge(long[] array, int s, int mid, int e) {
		long[] buf = new long[e - s + 1];
		int count = 0;
		long total = 0;
		int i = s, j = mid + 1;
		while (i <= mid && j <= e) {
			if (array[i] <= array[j])
				buf[count++] = array[i++];
			else {
				total += mid + 1 - i;
				buf[count++] = array[j++];
			}
		}
		while (i <= mid)
			buf[count++] = array[i++];
		while (j <= e)
			buf[count++] = array[j++];
		for (i = 0; i < buf.length; i++)
			array[s + i] = buf[i];
		return total;
	}

	private static long mergeSort(long[] array, int s, int e) {
		if (s >= e)
			return 0;
		else {
			long total = 0;
			int mid = (s + e) / 2;
			total += mergeSort(array, s, mid);
			total += mergeSort(array, mid + 1, e);
			total += merge(array, s, mid, e);
			return total;
		}
	}

	public static long numReverse(long[] array) {
		return mergeSort(array, 0, array.length - 1);
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		long T = in.nextLong();
		for (long i = 0; i < T; i++) {
			int N = in.nextInt();
			long[] a = new long[N];
			for (int j = 0; j < N; j++) {
				a[j] = in.nextLong();
			}
			System.out.println(numReverse(a));
		}
	}
}
