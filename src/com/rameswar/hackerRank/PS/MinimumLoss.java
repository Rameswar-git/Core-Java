package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class MinimumLoss {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		long[] arr = new long[n];
		ArrayList<Price> alist = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = inpReader.nextLong();
			alist.add(new Price(arr[i], i));
		}
		Collections.sort(alist);
		long min = Long.MAX_VALUE;
		for (int i = 1; i < alist.size(); i++) {
			Price c1 = alist.get(i);
			Price c2 = alist.get(i - 1);
			if(c2.index - c1.index >=1) {
				min = Math.min(min, c1.price - c2.price);
			}
		}
		System.out.println(min);
	}

	public static class Price implements Comparable<Price> {
		long price;
		int index;

		public Price(long price, int index) {
			this.price = price;
			this.index = index;
		}

		@Override
		public int compareTo(Price o) {
			return Long.compare(this.price, o.price);
		}

	}

}
