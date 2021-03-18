package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WeightedUniformStrings {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		char[] strs = inpReader.nextLine().toCharArray();
		ArrayList<Integer> lst = new ArrayList<>();
		lst.contains(5);
		int[] arr = new int[strs.length];
		Arrays.fill(arr, 1);
		arr[0] += strs[0] - 'a';
		for (int i = 1; i < strs.length; i++) {
			if (strs[i] == strs[i - 1]) {
				arr[i] += arr[i - 1] + strs[i] - 'a';
			} else {
				arr[i] += strs[i] - 'a';
			}

		}
		Arrays.sort(arr);
		int queries = inpReader.nextInt();
		for (int i = 0; i < queries; i++) {
			if (Arrays.binarySearch(arr, inpReader.nextInt()) >= 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}

}
