package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Quicksort1Partition {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = inpReader.nextInt();
		}
		int pivot = arr[0];
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <= pivot) {
				idx++;
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx]= temp;
			}
		}
		int temp = arr[idx];
		arr[idx] = pivot;
		arr[0] = temp;
		
		System.out.println(Arrays.toString(arr).replaceAll(",", "").replace("[", "").replace("]","").trim());
		inpReader.close();
	}

}
