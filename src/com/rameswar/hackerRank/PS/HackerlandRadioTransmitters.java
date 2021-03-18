package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HackerlandRadioTransmitters {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int k = inpReader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = inpReader.nextInt();
		}
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		int min = arr[0];
		Path[] patharr = new Path[max+1];
		for (int i = 0; i< n; i++) {
			patharr[arr[i]] = new Path(arr[i]);
		}
		int ttranscpunt  =0;
		for (int i = 0; i <= max ; i++) {
			if(patharr[i] != null && !patharr[i].isCovered) {
				int j = i+k;
				int trnsindex = 0;
				for (; j >= i; j--) {
					if(j<patharr.length && patharr[j] != null) {
						patharr[j].isCovered = true;
						ttranscpunt++;
						trnsindex = j;
						break;
					}
				}
				for (; j >= i && j>=0; j--) {
					if(patharr[j] != null && !patharr[j].isCovered ) {
						patharr[j].isCovered = true;
					}
				}
				int j2 = trnsindex;
				for (; j2 <= trnsindex+k && j2 < patharr.length; j2++) {
					if(patharr[j2] != null && !patharr[j2].isCovered) {
						patharr[j2].isCovered = true;
					}
				}
				i = i+k;
			}
		}
		System.out.println(ttranscpunt);
		inpReader.close();

	}

	static class Path {
		public int value;
		public boolean isCovered = false;

		public Path(int value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "Path [value=" + value + ", isCovered=" + isCovered + "]";
		}
	}

}
