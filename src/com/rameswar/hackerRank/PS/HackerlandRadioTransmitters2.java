package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HackerlandRadioTransmitters2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int k = inpReader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = inpReader.nextInt();
		}
		Arrays.sort(arr);
		int left = 0, right = 0, cursor = 0, end = 0, ans = 0;
		while (left < n) {
			cursor = left;
			ans++;
			while (cursor < n && arr[cursor] - arr[left] <= k) {
				cursor++;
			}
			cursor--;
			end = arr[cursor] + k;
			right = cursor + 1;
			while (right < n && arr[right] <= end) {
				right++;
			}
			left = right;
		}
		System.out.println(ans);
	}

}
