package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CountingSort1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int[] arr = new int[100];
		for (int i = 0; i < n; i++) {
			arr[inpReader.nextInt()]++;
		}
		System.out.println(Arrays.toString(arr).replaceAll("\\D+", " ").trim());
		inpReader.close();

	}
}
