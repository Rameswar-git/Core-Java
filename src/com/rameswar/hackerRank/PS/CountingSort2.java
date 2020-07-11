package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingSort2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		StringBuilder bld = new StringBuilder();
		int[] arr = new int[100];
		for (int i = 0; i < n; i++) {
			arr[inpReader.nextInt()]++;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				bld.append(i+" ");
			}
		}
		System.out.println(bld.toString().trim());
		inpReader.close();
	}
}
